/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo6;

/**
 *
 * @author minhdq
 */
public class Sleep extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
        // không dùng sleep?
//          for (int i = 1; i < 5; i++) {
//            System.out.println(i);
//        }

    }
 
    public static void main(String args[]) {
        Sleep t1 = new Sleep();
        Sleep t2 = new Sleep();
        t1.start();
//        t2.start();
    }
    public static void main01(String[] args) {
        Sleep t1 = new Sleep();
        Sleep t2 = new Sleep();
        
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
        
        t1.setName("Đại sư Thích Là Nhích");
        System.out.println("After changing name of t1: " + t1.getName());

        t1.start();
        t2.start();
//        t1.run();
//        t2.run();
        //đối tượng thông thường chứ không 
        //phải đối tượng luồng.
    }

}
