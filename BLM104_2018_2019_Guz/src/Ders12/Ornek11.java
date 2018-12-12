/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek11 {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\personeller.txt";
        BufferedOutputStream f=new BufferedOutputStream(new FileOutputStream(dosya,true));
        f.write("Kemal AK".getBytes());
        f.close(); 
        System.out.println("");
    }
}
