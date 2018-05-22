/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachDAL;
import DTO.Khach;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NhatMinh
 */
public class FormKhachHang {
    public static ArrayList<Khach> KhachArray(){
        return KhachDAL.getAll();
    }
    
    public static DefaultTableModel KhachModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Khách");
            model.addColumn("Tên khách");
            model.addColumn("Địa chỉ");
            model.addColumn("Điện thoại");
            for(int i = 0; i < KhachArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(KhachArray().get(i).getMaKhach());
                h.add(KhachArray().get(i).getTenKhach());
                h.add(KhachArray().get(i).getDiaChi());
                h.add(KhachArray().get(i).getDienThoai());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static int InsertKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return KhachDAL.Insert(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int UpdateKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return KhachDAL.Update(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int DeleteKhach(String MaKhach){
        return KhachDAL.Delete(MaKhach);
    }
}
