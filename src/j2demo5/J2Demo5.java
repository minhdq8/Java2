/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo5;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author minhdq
 */
public class J2Demo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
 
            File file = new File("newfile357.txt");
 
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
 
        } catch (IOException e) {
        }

    }
    
}
