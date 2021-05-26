/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoFull;


/**
 *
 * @author Fpoly
 */
public class SinhVien {

    private String masv, hoten, kyNang;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String masv, String hoten, double diem) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
    }

    public SinhVien(String masv, String hoten, String kyNang, double diem) {
        this.masv = masv;
        this.hoten = hoten;
        this.kyNang = kyNang;
        this.diem = diem;
    }


    public String getKyNang() {
        return kyNang;
    }

    public void setKyNang(String kyNang) {
        this.kyNang = kyNang;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return this.masv+"\t"+this.hoten+"\t"+this.diem;
    }

    

}
