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
public class Generic1 {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("j2demo8.Generic1.printArray()");
        
        String name;
        name = "fgdgdf";
        String text= "ffdfsd";
    }
 
    public static void main(String args[]) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A' };
 
        System.out.print("In mảng số nguyên: ");
        printArray(intArray);
 
        System.out.print("In mảng ký tự: ");
        printArray(charArray);
    }

}
/*
Element – phần tử
Key – khóa
Value – giá trị
Type – kiểu dữ liệu
Number – số
*/