/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoIOFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderExample {
 public static void main(String[] args) {   
   try {
     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
     File f = new File("FileWriter_UD.txt");
     FileReader fr = new FileReader(f);
     //Bước 2: Đọc dữ liệu
     BufferedReader br = new BufferedReader(fr);//
//     String s;
//     int i = 0;
//     while ((s = br.readLine()) != null){
// nếu đọc đc null nghĩa là kết thúc Stream
//            i++ ;
//            System.out.println(i + ":" + s);
//     }
     int ch = br.read();// java trả về từng các số mã hoá của từng ký tự
     while(ch != -1 ){//// read till the end of the stream
         System.out.print((char ) ch);
         ch = br.read();
     }
     //Bước 3: Đóng luồng
     fr.close();
     br.close();
    } catch (IOException ex) {
      System.out.println("Loi doc file: "+ex);
  }
 }
}
