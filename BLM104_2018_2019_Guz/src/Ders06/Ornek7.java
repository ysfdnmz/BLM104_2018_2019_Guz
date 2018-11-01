/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

import java.text.DecimalFormat;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("00,00.00");
        String s=df.format(2.6);
        System.out.println(s);
    }
}
