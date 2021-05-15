/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReviewOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.crypto.AEADBadTagException;

/**
 *
 * @author minhdq
 */
public class QLNhanVien {

    static Scanner sc = new Scanner(System.in);
    // khai báo và khởi tạo list chứa đối tượng NV
    ArrayList<NhanVien> listNV = new ArrayList<>();

    public void menu() {
        listNV.add(new NhanVien("1", "minh", 1));
        listNV.add(new NhanVien("2", "minh anh", 2));
        listNV.add(new NhanVien("3", "mình anh", 3));
        listNV.add(new NhanVien("4", "Mình minh", 4));
        listNV.add(new NhanVien("5", "Huy ngáo ngơ", 5));
        while (true) {
            System.out.println("1. Nhập thông tin NV");
            System.out.println("2. Xuất thông tin NV");
            System.out.println("3. Tìm NV theo mã");
            System.out.println("4. Xóa NV theo mã");
            System.out.println("5. SX NV theo tên");
            System.out.println("6. Sửa thông tin NV theo mã");
            System.out.println("0. Siêu thoát");

            System.out.print("Mời nhập lựa chọn: ");
            int luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    timNV();
                    break;
                case 4:
                    xoaNV();
                    break;
                case 5:
                    sapXepTheoTen();
                    break;
                case 6:
                    capNhat();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public boolean kTraMa(String x){
        boolean kTra = false;
        for(int i = 0; i < listNV.size(); i++){
            if(listNV.get(i).getManv().equalsIgnoreCase(x)){
                kTra = true;
            }
        }
        return kTra;
    }
    public void nhap() {
        System.out.println("NHẬP THÔNG TIN NV");
        while (true) {
            System.out.print("Nhập mã:");
            String maNV = sc.nextLine();
            try {
                if(kTraMa(maNV) == true){
                    System.out.println("Mã NV đã tồn tại");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Lỗi khi nhập mã NV");
            }
            
            System.out.print("Nhập tên:");
            String hoTen = sc.nextLine();
            System.out.print("Nhập lương:");
            double luong = Double.parseDouble(sc.nextLine());

            NhanVien nv = new NhanVien(maNV, hoTen, luong);
            listNV.add(nv);

            System.out.print("Y/N?");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.println("XUẤT THÔNG TIN NV");
        if (listNV.size() <= 0) {
            System.out.println("Danh sách rỗng, mời nhập thêm NV");
        } else {
            for (NhanVien xxx : listNV) {
                System.out.println(xxx);
            }
            
            //listNV.forEach((x) -> System.out.println(x));
        }
    }

    public void timNV() {
        System.out.print("Nhập mã NV cần tìm: ");
        String maNV = sc.nextLine();

        for (NhanVien x : listNV) {
            if (x.getManv().equals(maNV)) {
                System.out.println(x);
            }
        }
    }

    public void xoaNV() {

    }
    public void sapXepTheoTen(){
        Comparator<NhanVien> sxTen = new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien n1, NhanVien n2){
                return n2.getHoTen().compareTo(n1.getHoTen());
                // 0 thì n1 và n2 bằng nhau
                // 1 thì n1 > n2
                // -1 thì n1 < n2
            }
        };
        Comparator<NhanVien> sxLuong = new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien n1, NhanVien n2){
                return Double.compare(n2.getLuong(),n1.getLuong());
            }
        };
        System.out.println("SX theo tên");
        Collections.sort(listNV, sxTen);
        for(NhanVien x : listNV){
            System.out.println(x);
        }
        System.out.println("SX theo lương");
        Collections.sort(listNV, sxLuong);
        for(NhanVien x : listNV){
            System.out.println(x);
        }
        
        Collections.sort(listNV, (n1,n2) -> n1.getHoTen().compareTo(n2.getHoTen()));
        listNV.forEach(x -> System.out.println(x));
        
        Collections.sort(listNV, (x1,x2) -> x1.getManv().compareTo(x2.getManv()));
        listNV.forEach(zzzz -> System.out.print(zzzz));
        
        Collections.sort(listNV, (n1,n2) -> Double.compare(n1.getLuong(), n2.getLuong()));
        for(NhanVien x : listNV){
            System.out.println(x);
        }
    }
        
        
    
//    public void menu(){
//        listNV.add(new NhanVien("1","1",1));
//        listNV.add(new NhanVien("2","2",2));
//        listNV.add(new NhanVien("3","3",3));
//        listNV.add(new NhanVien("4","4",4));
//        listNV.add(new NhanVien("5","5",5));
//        
//        while(true){
//            System.out.println("1. Nhập danh sách nhân viên");
//            System.out.println("2. Xuất danh sách nhân viên");
//            System.out.println("3. Tìm NV theo mã");
//            System.out.println("0. Siêu thoát");
//            
//            System.out.print("Mời nhập lựa chọn: ");
//            int luaChon = Integer.parseInt(sc.nextLine());
//            
//            switch(luaChon){
//                case 1: 
//                    nhap();
//                    break;
//                case 2: 
//                    xuat();
//                    break;
//                case 3: 
//                    timNV();
//                    break;
//                case 0 : System.exit(0);
//                default: System.out.println("Nhập lại đi!");
//                    break;
//            }
//        }
//    }
//    public void nhap(){
//        System.out.println("NHẬP DANH SÁCH NHÂN VIÊN");
//        while(true){
//            System.out.print("Nhập tên: ");
//            String ten = sc.nextLine();
//            System.out.print("Nhập mã: ");
//            String maNV = sc.nextLine();
//            System.out.print("Nhập lương:");
//            double luong = Double.parseDouble(sc.nextLine());
//            
//            NhanVien nv = new NhanVien(maNV, ten, luong);
//            listNV.add(nv);
//            
//            System.out.print("Nhập tiếp/Không: ");
//            if(sc.nextLine().equalsIgnoreCase("n")){
//                break;
//            }
//        }
//    }
//    public void xuat(){
//        System.out.println("XUẤT DANH SÁCH NHÂN VIÊN");
//        int i = 1;
//        for(NhanVien xxx : listNV){
//            System.out.printf("NV %d : ", i);
//            System.out.println(xxx);
//            i++;
//        }
//        //lambda
//        //listNV.forEach((x) -> System.out.println(x));
//    }
//    public void timNV(){
//        System.out.println("TÌM NV THEO MÃ");
//        System.out.print("Mã NV cần tìm: ");
//        String maNV = sc.nextLine();
//        
//        for(NhanVien a : listNV){
//            if(a.getManv().equalsIgnoreCase(maNV)){
//                System.out.println(a);
//            }
//        }
//    }

    private void capNhat() {
        int count = 0 ;
        System.out.print("Nhập mã cần sửa: ");
        String maSua = sc.nextLine();
        for(NhanVien x : listNV){
            if(x.getManv().equalsIgnoreCase(maSua)){
                System.out.print("Nhập mã mới: ");
                String maNV = sc.nextLine();
                System.out.println("Nhập họ tên mới: ");
                String hoTen = sc.nextLine();
                System.out.println("Nhập lương mới: ");
                double luong = Double.parseDouble(sc.nextLine());
                
                listNV.set(count, new NhanVien(maNV, hoTen, luong));
                break;
            }
            count ++;
        }
        
        
    }
}
