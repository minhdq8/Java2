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
public class tryFinal {
    public static void main(String[] args) {
        
    /*
    try {
    // code có thể ném ra ngoại lệ
    } finally {
        // code trong khối này luôn được thực thi
    
        Quy tắc: Đối với mỗi khối try, có thể có 1 hoặc nhiều khối catch,
        nhưng chỉ có một khối finally.
        Note: Khối finally sẽ không được thực thi nếu chương trình
        bị thoát (bằng cách gọi System.exit() 
        hoặc xảy ra một lỗi không thể tránh khiến chương trình bị chết).
        */
    Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Mời bạn nhập 1 số:");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Số bạn vừa nhập:"+a);
        } 
        catch(NumberFormatException e1){
            System.out.println("Bạn vừa nhập không phải là số");
        }
        catch (Exception e) {
            System.out.println("Bạn gặp lỗi: "+e);
        }
        finally{
            System.out.println("Khối final luôn thực hiện dù có ngoại lệ hay không");
        }
    }
}
