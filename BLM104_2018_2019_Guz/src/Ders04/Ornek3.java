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
public class Ornek3 {
    public static void main(String[] args) {
       
        Araba a= new Araba();
        a.model="Honda";
        modelDegistir(a);
        System.out.println(a.model);
        
        String s="Eski de?er";
        degistir(s);
        System.out.println(s);
        
    }
    static void modelDegistir(Araba a){
        a.model="Mercedes";
    }
    static void degistir(String s){
        s="Yeni De?er";
    }
}
