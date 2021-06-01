/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo5;

/**
 *
 * @author
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputExample {

    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream("IT16303.txt");
            DataInputStream dis = new DataInputStream(fis);

            //Bước 2: Đọc dữ liệu
            int n = dis.readInt();
            double m = dis.readDouble();

            //Bước 3: Đóng luồng
            fis.close();
            dis.close();

            //Hiển thị nội dung đọc từ file
            System.out.println("Số nguyên: " + n);
            System.out.println("Số thực: " + m);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
