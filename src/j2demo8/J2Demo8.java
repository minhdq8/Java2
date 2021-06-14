/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo8;

/**
 *
 * @author minhdq
 */
public class J2Demo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code ayspplication logic here
        
        
        // use Integer
        MyGeneric<Integer> m1 = new MyGeneric<>();
        m1.add(2);
        System.out.println(m1.get());
 
        // use String
        MyGeneric<String> m2 = new MyGeneric<>();
        m2.add("Hello");
        System.out.println(m2.get());

    }
    
}
class MyGeneric<T> {
    T obj;
 
    void add(T obj) {
        this.obj = obj;
    }
 
    T get() {
        return obj;
    }
}
/*
Việc đặt tên tham số là rất quan trọng để học genericis.
T – Type
E – Element
K – Key
N – Number
V – Value
*/