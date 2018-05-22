/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author NhatMinh
 */
public class NhanVien {
    private String MaNhanVien;
    private String TenNhanVien;
    private String GioiTinh;
    private String DiaChi;
    private String DienThoai;
    private String NgaySinh;
    
    public NhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh,String DiaChi, String DienThoai,String NgaySinh){
    this.DiaChi=DiaChi;
    this.DienThoai=DienThoai;
    this.GioiTinh=GioiTinh;
    this.MaNhanVien=MaNhanVien;
    this.NgaySinh=NgaySinh;
    this.TenNhanVien=TenNhanVien;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
}
