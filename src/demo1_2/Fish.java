/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_2;

/**
 *
 * @author minhdq
 */
public class Fish extends Animal {

    public Fish(String name, int weight, int high) {
        super(name, weight, high);
    }

    @Override
    public String move() {
        return "Di chuyển : bơi";
    }

    @Override
    public String eat() {
        return "";
    }

}
