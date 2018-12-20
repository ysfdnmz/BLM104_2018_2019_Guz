/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/*

*/

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
       //Personel calisanlar[]=new Personel[10];
       ArrayList calisanlar=new ArrayList();
       calisanlar.add("Ahmet AK");
       calisanlar.add(new Personel("Mehmet","Sar?"));
       System.out.println(((Personel)calisanlar.get(1)).adi); // Upcast işlemi yapılmış. calisanlar Personele Upcast edilmiş

        System.out.println("--------------------");
       ArrayList<Personel> personeller=new ArrayList();
       personeller.add(new Personel("Ahmet", "AK"));
       personeller.add(new Personel("Ay?e", "AK"));

       System.out.println(personeller.get(0).adi);

        for (Personel p : personeller) {
            System.out.println(p.adi+" "+p.soyadi);
        }
        System.out.println(personeller.size());



    }
}
