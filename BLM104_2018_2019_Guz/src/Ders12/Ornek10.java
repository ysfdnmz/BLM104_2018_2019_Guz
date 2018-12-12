/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek10 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\personeller.txt";
        BufferedInputStream f=new BufferedInputStream(new FileInputStream(dosya));
        int c;
        while ((c=f.read())!=-1){
            System.out.print((char)c);
        }
        System.out.println("");
    }
}
