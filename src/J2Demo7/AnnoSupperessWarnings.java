/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J2Demo7;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class AnnoSupperessWarnings {

    class Child {

        public Date getDate(int year, int month, int date) {
            @SuppressWarnings("Deprecation")
            Date d = new Date(2021, 06, 11);
            return d;
        }

        public List<String> getList() {

            ArrayList list = new ArrayList();
            return (List<String>) list;
        }

        public List<String> getList2() {

            ArrayList list = new ArrayList();
            return (List<String>) list;
        }
    }
}
