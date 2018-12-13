/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya = "c:\\dosyalar\\sayilar.txt";
        BufferedReader f = new BufferedReader(new FileReader(dosya));
        String s[]=new String[5];
        int i=0;
        while ((s[i]=f.readLine())!=null){
            System.out.println(s[i]);
            i++;
        }
            
    
    }
}
