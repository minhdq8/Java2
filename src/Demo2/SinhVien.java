/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo2;

/**
 *
 * @author minhdq
 */
public class SinhVien {
    private String classMate;
    private String userName;
    private String passWord;

    public SinhVien(String userName, String passWord, String classmate) {
        this.userName = userName;
        this.passWord = passWord;
        this.classMate = classmate;
    }

    public String getClassMate() {
        return classMate;
    }

    public void setClassMate(String classMate) {
        this.classMate = classMate;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
}
