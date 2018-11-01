/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        String desen="([0-9]+[A-z]+)";
        String aranan ="Fatih132a Sultan131313 Mehmet9 1a ata bindi";
        Pattern p=Pattern.compile(desen);
        Matcher m=p.matcher(aranan);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
