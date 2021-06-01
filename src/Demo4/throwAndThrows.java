/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

import java.util.Scanner;

/**
 *
 * @author minhdq
 */
public class throwAndThrows {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Mời bạn nhập tuổi:");
        int a = Integer.parseInt(sc.nextLine());
        
        validateThrow(a);
//        validateThrow2(a);
    }
    
    static void validateThrow(int age) {
        if (age <= 18)
            throw new ArithmeticException("Nhóc con ;))");
        else
            System.out.println("Ahihi 18+");
    }
    static void validateThrow2(int age) {
        try{
/*          throw trong java được sử dụng để ném ra một ngoại lệ cụ thể.
            Chúng ta có thể ném một trong hai ngoại lệ checked hoặc
            unchecked trong java bằng từ khóa throw. 
            Từ khóa throw chủ yếu được sử dụng để ném ngoại lệ tùy chỉnh 
            (ngoại lệ do người dùng tự định nghĩa)
*/
            if (age < 18)
            throw new ArithmeticException("Nhóc con ;))");
        else
            System.out.println("Ahihi 18+");
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }

    }
    
}
