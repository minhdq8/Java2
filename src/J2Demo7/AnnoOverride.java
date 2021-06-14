/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J2Demo7;

/**
 *
 * @author minhdq
 */
public class AnnoOverride {
    public static void main(String[] args) {
        
    }
}

class Dog extends Animal{
    @Override// ghi đè pthuc trùng tên khi kế thừa của cha
    void eating(){
        System.out.println("Ăn thịt");
    }
}
class Animal{
    void eating(){
        System.out.println("Ăn để sống");
    }
    
}
