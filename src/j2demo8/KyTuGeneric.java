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
public class KyTuGeneric {
    /*Ký tự ? (dấu chấm hỏi) tượng trưng cho phần tử ký tự đại diện.
    Nó có nghĩa là bất kỳ loại nào. Nếu chúng ta viết
    <? extends Number>, nó có nghĩa là bất kỳ lớp con của Number
    ví dụ như Integer, Float, Double 
    */
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();// goi phuong thuc cua lop Shape boi lop con
        }
    }
 
    public static void main(String args[]) {
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());
 
        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());
 
        drawShapes(list1);
        drawShapes(list2);
    }

}
     abstract class Shape {
        abstract void draw();
    }

    class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("ve hinh chu nhat.");
        }
    }

    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("ve hinh tron.");
        }
    }
