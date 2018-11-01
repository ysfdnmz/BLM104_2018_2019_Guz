/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        String s="Fat1321313ih 1 Mehmet 32132";
        Random r=new Random();
        
        char secilen=s.charAt(r.nextInt(s.length()));
        System.out.println(secilen+" : "+Character.isDigit(secilen));
    }
}
