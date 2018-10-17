/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        String s="Ahmet Ak"; 
        System.out.println(s.indexOf("k",5));
        
        // indexof ve substring
        int bosluk=s.indexOf(" ");
        String adi=s.substring(0,bosluk);
        System.out.println(adi);
        String soyadi=s.substring(bosluk+1);
        System.out.println(soyadi);        
    }
}
