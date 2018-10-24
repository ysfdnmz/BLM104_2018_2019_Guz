/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anizam
 */
public class Ornek12 {
        public static void main(String[] args) {
        String desen="[0-9]";
        String aranan ="Fatih1 Sultan2 Mehmet9 ata bindi";
        Pattern p=Pattern.compile(desen);
        Matcher m=p.matcher(aranan);
        int toplam=0;
        while (m.find()){
            System.out.println(m.group()+" - "+m.start()+":"+m.end());
            if (Integer.parseInt(m.group())%2==1)
            toplam=toplam+Integer.parseInt(m.group());
        }
            System.out.println("Toplam = "+toplam);
     }
}
