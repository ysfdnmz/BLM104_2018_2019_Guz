/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek5;

/**
 *
 * @author anizam
 */
public class Ambar {
    int varolanMalzemeAdet;
    void satisYap(int satilanMalzeme){
        if (this.varolanMalzemeAdet-satilanMalzeme<0)
            throw new stokHata(this.varolanMalzemeAdet-satilanMalzeme);
        this.varolanMalzemeAdet-=satilanMalzeme;
    }
}
