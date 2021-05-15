/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author minhdq
 */
public class Car {
    void run(){
        System.out.println("Chạy");
    }
}
class Toyota extends Car{
    @Override
    void run(){
        System.out.println("Chạy ở VN");
    }
    
    public static void main(String[] args) {
        Car oto = new Toyota();
        oto.run();
    }
}



