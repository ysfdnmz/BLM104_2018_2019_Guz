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
public class Ornek4 {
    public static void main(String[] args) {
        String s="Ahmet";
        System.out.println(s.length());
        System.out.println("Ahmet".length());
        System.out.println(s.charAt(3));
        
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println("---------------------------");
        //tersten yazd?rma
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
        
        // Birle?tirme
        
        s=s.concat(" Ak");
        System.out.println(s);
        // substring

        System.out.println(s.substring(3, 5));
        
        System.out.println(s.substring(5));
        
        //split
        
        String kisiler="Ahmet,Mehmet,Ay?e";
        String kisiDizisi[]=kisiler.split(",");
        
        
        System.out.println("  Ahmet    ".trim());
    }
 
}
