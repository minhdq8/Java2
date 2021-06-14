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
public class Multi2 implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
             System.out.printf("thread is running... %d\n" , i);
             try {
                 Thread.sleep(1000);
             } catch (Exception e) {
             }
         }
    }

    public static void main(String args[]) {
        Multi2 m1 = new Multi2();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        t1.start();
        t2.start();

    }
}
