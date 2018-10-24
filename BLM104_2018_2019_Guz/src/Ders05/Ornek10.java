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
public class Ornek10 {
    public static void main(String[] args) {
        String desen="[\\s]";
        String aranan ="FAtih1 Sultan2 Mehmet14554 ";
        Pattern p=Pattern.compile(desen);
        Matcher m=p.matcher(aranan);
        while (m.find()){
            System.out.println(m.group()+" - "+m.start()+":"+m.end());
        }    
     }
}
