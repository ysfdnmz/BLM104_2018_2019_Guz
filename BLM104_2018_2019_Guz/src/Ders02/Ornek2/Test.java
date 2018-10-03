/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Mercedes[] mercedesler=new Mercedes[3];
        Audi[] audiler=new Audi[5];
        Araba[] arabalar=new Araba[3];
        
        Araba a=new Mercedes();
        System.out.println(a.getFiyat());
        
        Araba b=new Mercedes();
        if (b instanceof Mercedes)
            ((Mercedes)b).yildizla();
        
        Mercedes m=(Mercedes)(new Araba());
        
    }
}
