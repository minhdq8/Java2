/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author minhdq
 */
public interface animal {

    // tất cả các pthuc trong interface đều là abstract
    void eating();
    void moving();

}
class Cat implements animal {
    @Override
    public void eating() {
        System.out.println("Ko ăn thì chết chắc");
    }
    @Override
    public void moving() {
        System.out.println("Ko đi thì nằm :D ");
    }
}

class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eating();
        cat.moving();
    }
}