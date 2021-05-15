/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo1;

/**
 *
 * @author minhdq
 */
public class ToanGiai {
    // thuộc tính
    private String _name;
    int _tuoi;
    
    // phương thức
    
    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getTuoi() {
        return _tuoi;
    }

    public void setTuoi(int _tuoi) {
        this._tuoi = _tuoi;
    }

    public ToanGiai(String _name, int _tuoi) {
        this._name = _name;
        this._tuoi = _tuoi;
    }
    
    public void ngamNu(){
        System.out.println("Giai chuẩn ");
    }
    public String ngamNam(){
        return "3 chạc";
    }

    @Override
    public String toString() {
        return "ToanGiai{" + "_name=" + _name + ", _tuoi=" + _tuoi + '}';
    }
    
}
