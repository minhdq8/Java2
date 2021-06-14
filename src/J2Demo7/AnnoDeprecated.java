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
public class AnnoDeprecated {
    public static void main(String[] args) {
        A ok = new A();
        ok.show();
    }
}
class A {
    @Deprecated// cảnh báo không nên dùng
    void show(){
        System.out.println("ko nên dùng");
    }
}

