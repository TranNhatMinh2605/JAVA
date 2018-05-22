/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChiTietHDBanDAL;
import DAL.HDBanDAL;
import DAL.HangDAL;
import DAL.KhachDAL;
import DAL.NhanVienDAL;
import DTO.HDBan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NhatMinh
 */
public class FormHoaDon {
    public static ArrayList<HDBan> HDBanArray(){
        return HDBanDAL.getAll();
    }
    
    public static DefaultTableModel HDBanModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Hàng");
            model.addColumn("Tên hàng");
            model.addColumn("Số lượng");
            model.addColumn("Đơn giá");
            model.addColumn("Giảm giá");
            model.addColumn("Thành tiền");
            return model;
        } catch (Exception e){
            return null;
        }
    }   
   
    public static String TenNVHDBan(String MaNhanVien){
        return NhanVienDAL.TenNhanVien(MaNhanVien);
    }
    
    public static String TenKhachHDBan(String MaKhach){
        return KhachDAL.TenKhach(MaKhach);
    }
    
    public static String DTKhachHDBan(String MaKhach){
        return KhachDAL.DienThoai(MaKhach);
    }
    
    public static String DCKhachHDBan(String MaKhach){
        return KhachDAL.DiaChi(MaKhach);
    }
    
    public static String TenHangHDBan(String MaHang){
        return HangDAL.TenHang(MaHang);
    }
    
    public static String DonGiaHDBan(String MaHang){
        return HangDAL.DonGia(MaHang);
    }
    
    public static int InsertHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HDBanDAL.Insert(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int UpdateHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HDBanDAL.Update(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int DeleteHDBan(String MaHDBan){
        return HDBanDAL.Delete(MaHDBan);
    }
    
    public static int InsertChiTietHDBan(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        return ChiTietHDBanDAL.Insert(MaHDBan, MaHang, SoLuong, DonGia, GiamGia, ThanhTien);
    }
}
