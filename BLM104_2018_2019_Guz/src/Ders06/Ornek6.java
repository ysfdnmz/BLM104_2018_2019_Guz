/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.Locale;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        System.out.format("Maa? %,08d \n", 1000000);
        System.out.format("Maa? %,08d \n", -1);
        
        System.out.format("Maa? %,08.2f \n", 10.3);
        
        System.out.format("%d' TL Maa??n  %%10u  %,08.2f x 1000 dolard?r %d\n", 45000,4.5f,1);
        
        System.out.printf(Locale.ITALY,"%,2.2f\n",10000000.3f);
    
    }
}
