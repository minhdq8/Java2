/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J2Demo7;

import java.util.ArrayList;

/**
 *
 * @author minhdq
 */
public class Test {
        @SuppressWarnings({"unchecked"})
        public static void main(String[] args) {
            ArrayList list = new ArrayList();
            list.add("a");
            list.add("a");
            list.add("a");
            
            for (Object object : list) {
                System.out.println(object);
            }
        }
    }

