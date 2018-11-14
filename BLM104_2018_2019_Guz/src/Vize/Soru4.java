/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author anizam
 */
public class Soru4 {
    public static void main(String[] args) {
        Random r=new Random();
        String s="";
        int basamakDegeri=1;
        int sayi=0;
        for (int i = 0; i < 5; i++) {
           // s=s+r.nextInt(10);
            sayi+=basamakDegeri*r.nextInt(10);
            basamakDegeri*=10;   
        }
      //  System.out.println(Integer.parseInt(s)); 
        System.out.println(sayi);
        System.out.printf("%,09.2f\n",sayi/100.0);   
        
        DecimalFormat df=new DecimalFormat("000,000.00");
        System.out.println(df.format(sayi/100.0));
    }
}
