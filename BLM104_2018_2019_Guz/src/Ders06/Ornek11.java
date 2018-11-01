/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek11 {
    public static void main(String[] args) {
        Random r=new Random();
        int sayi=r.nextInt(50);
        System.out.println(sayi);
        int sayilar[]=new int[3];
        int indis;
        for (int i = 0; i < 1000000; i++) {
             indis=r.nextInt(3);
             sayilar[indis]++;
        }
        System.out.println(sayilar[0]+" "+sayilar[1]+" "+sayilar[2]);
    }
}
