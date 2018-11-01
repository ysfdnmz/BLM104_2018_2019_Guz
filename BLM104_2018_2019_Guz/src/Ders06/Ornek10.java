/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author anizam
 */
public class Ornek10 {
    public static void main(String[] args) {
        System.out.println(Math.random());
        int sayilar[]=new int[3];
        int indis;
        for (int i = 0; i < 1000000; i++) {
             indis=(int)(3*Math.random());
             sayilar[indis]++;
        }
        System.out.println(sayilar[0]+" "+sayilar[1]+" "+sayilar[2]);
    }
}
