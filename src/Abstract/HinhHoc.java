/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author minhdq
 */
public abstract class HinhHoc {
    // chứa 1 pthuc abstact -> lớp cũng phải abstract
    abstract double chuVi();
    abstract double dienTich();
    
}

// khi kế thừa thì bắt buộc phải override lại pthu abstract của lớp cha
class HinhTron extends HinhHoc{
    double banKinh;
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    @Override
    double chuVi() {
        return 2*banKinh*3.14;
    }
    @Override
    double dienTich() {
        return 3.14 * banKinh*banKinh;
   }
    public void showInfo(){
        System.out.println("Chu vi : " + chuVi());
        System.out.println("Diện tích : " + dienTich());
    }
}
class chayHinh{
    public static void main(String[] args) {
        HinhTron hTron = new HinhTron(3);
        hTron.showInfo();
    }
}