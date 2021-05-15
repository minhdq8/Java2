/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_2;



/**
 *
 * @author minhdq
 */
public class demoKeThua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello Java2 !");
//        
//        Animal dongVat = new Animal("ăn tiền", 50, 165);
//        dongVat.showInfo();
//        dongVat.eat();
//        dongVat.move();
//        System.out.println("=========");
//        
        Duck conVit = new Duck(10, 3, "vịt người", 30, 155);
//        conVit.showInfo();
        System.out.println(conVit.eat());
        System.out.println("\n============");
        
        Fish conCa = new Fish("cá hổ", 2, 3);
        System.out.println(conCa.eat());
        System.out.println("-------------");
        
//        Animal conVat = new Animal("lấy tiền", 55, 170);
//        conVat.move();
//        conVat = new Duck("conDuck", 2, 4);
//        conVat.move();
//        conVat = new Fish("cá 3d", 2, 4);
//        conVat.move();
    }
    
}
