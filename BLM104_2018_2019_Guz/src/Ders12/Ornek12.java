/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek12 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\personeller.txt";
        BufferedReader f=new BufferedReader(new FileReader(dosya));
        String satir;
        while((satir=f.readLine())!=null){
            System.out.println(satir);    
        }
        f.close();
    }
}
