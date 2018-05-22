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
public class Hang {
    private String MaHang;
    private String TenHang;
    private String MaChatLieu;
    private String Anh;
    private String GhiChu;
    private float SoLuong;
    private float DonGiaNhap;
    private float DonGiaBan;
    
    public Hang(String MaHang, String TenHang, String MaChatLieu, String Anh, String GhiChu, float SoLuong, float DonGiaNhap, float DonGiaBan){
    this.Anh=Anh;
    this.DonGiaBan=DonGiaBan;
    this.DonGiaNhap=DonGiaNhap;
    this.GhiChu=GhiChu;
    this.MaChatLieu=MaChatLieu;
    this.MaHang=MaHang;
    this.SoLuong=SoLuong;
    this.TenHang=TenHang;
    }

    public Hang(String MaHang, String TenHang, String MaChatLieu, float SoLuong, float DonGiaNhap, float DonGiaBan, String Anh, String GhiChu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getMaChatLieu() {
        return MaChatLieu;
    }

    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public float getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(float SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGiaNhap() {
        return DonGiaNhap;
    }

    public void setDonGiaNhap(float DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    public float getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(float DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }
    
}
