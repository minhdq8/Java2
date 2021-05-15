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
interface ChauA {

    void daVang();
}

interface ChauAU {

    void daTrang();
}

class banOanh implements ChauA, ChauAU {

    @Override
    public void daVang() {
        System.out.println("Oanh da Vàng");
    }

    @Override
    public void daTrang() {
        System.out.println("Oanh da Trắng");
    }
}



interface OngNoi {
    void diBo();
}
interface OngBo extends OngNoi {
    void diXeDap();
}
class baby implements OngBo {
    @Override
    public void diXeDap() {
    }
    @Override
    public void diBo() {
    }
}
