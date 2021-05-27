/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class J2Demo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.print("Mời nhập điểm: ");
            Scanner sc = new Scanner(System.in);
            double diem = sc.nextDouble();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Điểm phải là số từ 0 - 10");
        }
        
        try {
              //Những khối lệnh có thể phát sinh lỗi
		int[] a = {5,6,7};
		System.out.println(a[10]);
	} catch (ArrayIndexOutOfBoundsException e) {
            //tham số e là tên lỗi muốn xử lý
              //Chương trình thực hiện khi gặp lỗi trên
              System.out.println(e);
		System.out.println("Kiểm tra lại độ dài mảng");
	}
    }
    public static void main09(String[] args) {
        int S=0;
	try {
		for (String arg : args) {
			S+= Integer.parseInt(arg);
			System.out.println(arg);
		}
	} catch (Exception e) {
            //Nếu bạn không thể lường trước toàn bộ lỗi, 
            //ta có thể đặt mặc định Exception để xử lý lỗi mà bạn chưa tính đến được.
		System.out.println("Error:"+e.toString());
	}
    }
    
}
