/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

import java.io.IOException;

/**
 *
 * @author minhdq
 */
public class Throws2 {
    public static void main(String[] args) {
        try {
            Throws2 object = new Throws2();
            object.aa();
        } catch (Exception e) {
            System.out.println("Lỗi ở main");
        }
        System.out.println("Khó hiểu chưa =)) ");
    }
    void aa () throws IOException{
        throw new IOException("lap cùi quá");
    }
}
