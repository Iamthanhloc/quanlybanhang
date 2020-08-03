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
public class QLNhanvien{
    
    protected String maNV,tenNV,DiaChi,gioiTinh;
    protected Date ngaySinh;
    protected int sdt;

    public QLNhanvien(String maNV, String tenNV, String DiaChi,int sdt , Date ngaySinh, String gioiTinh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.DiaChi = DiaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
    }

    public QLNhanvien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    
}

   

