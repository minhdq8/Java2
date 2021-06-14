/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class j5_6_7 {
    
    public static void main(String[] args) {
        // trong java 6 va cac phien ban truoc
        System.out.println("Java 6:");
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        for (Integer element : list) {
            System.out.println(element);
        }
        // trong java 7
        System.out.println("Java 7:");
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        for (Integer element : list2) {
            System.out.println(element);
        }
    }

}
