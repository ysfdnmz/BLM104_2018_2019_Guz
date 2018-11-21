/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        int i;
        try {
            i=5/0;
            System.out.println("Ba?ar?l?");
        } catch (Exception e) {
            System.out.println("Hata var");
        }finally{
            System.out.println("Bitti");
        }
 
    }
}
