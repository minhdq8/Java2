
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

public class Demo {

    public static void main(String[] args) {              
        System.out.println("Mang tr1:");
        Transport []tr1= new Transport[3];
        tr1[0]=Transport.AIRPLAIN;
        tr1[1]=Transport.TRUCT;
        tr1[2]=Transport.CAR;
        for (Transport t : tr1) {
            System.out.println(t);
        }
    }

}
