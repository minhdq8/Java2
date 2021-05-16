/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

/**
 *
 * @author minhdq
 */
public class Car {
    private String _phanKhuc;
    void run(){
        System.out.println("Chạy");
    }
}
class BMW extends Car{
    
}
class Toyota extends Car{
    
    @Override
    void run(){
        System.out.println("Chạy Toyota ở VN");
}
    void chay(){
        System.out.println("Chạy bộ đấy làm sao ?");
    }
    
    public static void main(String[] args) {
        Car oto;
        oto = new Toyota();
        oto.run();
        
        oto = new BMW();
        oto.run();
        
    }
}



