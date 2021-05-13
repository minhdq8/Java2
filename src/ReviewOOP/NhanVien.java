/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewOOP;

/**
 *
 * @author minhdq
 */
public class NhanVien {
    // thuộc tính
    private String manv;
    private String hoTen;
    private double luong;
    // phương thức

    @Override
    public String toString() {
        return "NhanVien{" + "manv=" + manv + ", hoTen=" + hoTen + ", luong=" + luong + '}';
    }

    public NhanVien(String manv, String hoTen, double luong) {
        this.manv = manv;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
   
}
