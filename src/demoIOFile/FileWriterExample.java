/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoIOFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {
        File f ;
        FileWriter fw = null ;
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            f = new File("FileWriter_1530B.txt");
            fw = new FileWriter(f);
            //Bước 2: Ghi dữ liệu
            fw.write("Nóng nên bực,  ngực tập mình nực to");
            fw.write("\n");
            fw.write("Ghi chán chê mê mỏi mệt mãi mệt mỏi mắt mũi mồm miệng méo ");
            //Bước 3: Đóng luồng
        } catch (IOException ex) {
            System.out.println("Lỗi " + ex);
        } finally{
            fw.close();
        }
        
    }
}
