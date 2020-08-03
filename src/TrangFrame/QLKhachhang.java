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
 public class QLKhachhang {
    String makh,tenkh,gioitinh,diachi;
    Date Ngaysinh;
    int soDT;

    public QLKhachhang() {
    }

    public QLKhachhang(String makh, String tenkh, String diachi,int soDT, Date Ngaysinh,String gioitinh ) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.Ngaysinh = Ngaysinh;
        this.soDT = soDT;
    }

    
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }
    
}
