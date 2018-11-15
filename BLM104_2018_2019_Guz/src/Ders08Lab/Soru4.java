/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab;

/**
 *
 * @author anizam
 */
public class Soru4 {

    public static void main(String[] args) {
        Personel[] calisanlar = new Personel[3];
        Personel p1 = new Personel();
        p1.maas = 10000;
        p1.adi="Ahmet";
        calisanlar[0] = p1;
        Personel p2 = new Personel();
        p2.maas = 10000;
        calisanlar[2] = p2;
        int toplam = 0;
        
        for (Personel p : calisanlar) {
            try {
                 if ("Ahmet".equals(p.adi))
                  toplam+=p.maas;
            } catch (NullPointerException e) {
                p=new Personel();
                System.out.println("Bir personel yok");
            }
           
        }
        System.out.println("Toplam maa? = "+ toplam);
       
       

    }
}
