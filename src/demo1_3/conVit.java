/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_3;

/**
 *
 * @author minhdq
 */
public class conVit implements giaCam{
   
    @Override
    public void kyNang() {
        System.out.println("đây là phương thức của Interface giaCam");    
    }

    @Override
    public void eat() {
        System.out.println("đây là phương thức của interface dongVat");
    }
    public static void main(String[] args) {
        conVit duck = new conVit();
        duck.kyNang();
        duck.eat();
        
    }
}
