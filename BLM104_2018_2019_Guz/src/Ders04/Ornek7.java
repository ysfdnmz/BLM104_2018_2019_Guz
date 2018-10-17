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
public class Ornek7 {

    public static void main(String[] args) {
        String s = "Ahmet";
        if (s == "Ahmet") {
            System.out.println("E?ittir");
        }
        String s1 = new String("Ahmet");

        if (s == s1) {
            System.out.println("nesnenler e?it ");
        } else {
            System.out.println("E?it de?il");
        }
        
        System.out.println(new String("Ahmet")==new String("Ahmet"));
        
        System.out.println(s.equals(s1));
        System.out.println(new String("Ahmet").equals(new String("Ahmet")));
        
    }
}
