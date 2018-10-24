/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        double d=31.163;
        String s=String.valueOf(d);
        System.out.println(s.substring(0,s.indexOf(".")));
        System.out.println(s.substring(s.indexOf(".")+1));
    }
}
