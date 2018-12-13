/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya = "c:\\dosyalar\\sayilar.txt";
        FileInputStream f = new FileInputStream(dosya);
        int c;
        char sonuc[]=new char[30];
        int i=0;
        while ((c=f.read())!=-1){
            sonuc[i]=(char)c;
            i++;
        }
        System.out.println(new String(sonuc));   
    }
}
