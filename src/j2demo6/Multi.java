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
public class Multi extends Thread{
     @Override
     public void run() {
         for (int i = 0; i < 10; i++) {
             System.out.printf("thread is running... %d\n" , i);
             try {
                 Thread.sleep(1000);
             } catch (Exception e) {
             }
         }
    }// sau khi chạy xong run thì thread tự hủy
    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();// pthuc để bắt đầu thực thi thread
        Multi t2 = new Multi();
        t2.start();
    }
}
