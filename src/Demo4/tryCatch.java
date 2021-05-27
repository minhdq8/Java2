/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

/**
 *
 * @author minhdq
 */
public class tryCatch {
    public static void main01(String args[]) {
        int data = 50 / 0;  // ném ra ngoại lê ở đây
        System.out.println(data);
        System.out.println("Lỗi rồi in ra đc ko ?...");
    }
        /*
            try {  
            // code có thể ném ra ngoại lệ
        } catch(Exception_class_Name ref) {
            // code xử lý ngoại lệ
        }  
        */
    public static void main11(String[] args) {
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Lỗi rồi in ra đc ko ?...");

    }
    public static void main(String[] args) {
        /*
        Qui tắc 1: Tại một thời điểm, chỉ một exception được xuất hiện và 
        tại một thời điểm chỉ có một khối catch được thực thi.
        Qui tắc 2: Tất cả khối catch phải được sắp xếp từ cụ thể nhất tới 
        chung nhất
        ví dụ: việc bắt ArithimeticExption phải ở trước việc bắt Exception.
        */
        try{  
            int a[]=new int[5];//
            a[10] = 10;
            a[5]=30/0;
        } 
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Task1 duoc hoan thanh");
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Task2 duoc hoan thanh");
        }
        catch(Exception e){
            System.out.println("Task chung duoc hoan thanh");
        }
        System.out.println("Phan code con lai...");  
    }
}   
