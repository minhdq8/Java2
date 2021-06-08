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
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        Multi2 m1 = new Multi2();
        Thread t1 = new Thread(m1);
        t1.start();
        Thread t2 = new Thread(new Multi2());
        t2.start();

    }
}
