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
public class ChiTietHDBan {
    private String MaHDBan;
    private String MaHang;
    private float SoLuong;
    private float DonGia;
    private float GiamGia;
    private float ThanhTien;
    
    public ChiTietHDBan(String MaHDBan, String MaHang, float SoLuong, float DonGia, float GiamGia, float ThanhTien){
    this.MaHDBan=MaHDBan;
    this.MaHang=MaHang;
    this.SoLuong=SoLuong;
    this.DonGia=DonGia;
    this.GiamGia=GiamGia;
    this.ThanhTien=ThanhTien;
    }

    public String getMaHDBan() {
        return MaHDBan;
    }

    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public float getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(float SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public float getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(float GiamGia) {
        this.GiamGia = GiamGia;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
}
