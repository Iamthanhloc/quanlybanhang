/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrangFrame;

import java.util.Date;

/**
 *
 * @author Nguyễn Thành lộc
 */
public class ClassSp {
    public String MaSP, TenSP,SoLuong;
    Date NgayNhap;
    public int DonGia;
    
    public ClassSp(){
        
    }

    public ClassSp(String MaSP, String TenSP, String SoLuong, int DonGia, Date NgayNhap) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.NgayNhap = NgayNhap;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
           
}
