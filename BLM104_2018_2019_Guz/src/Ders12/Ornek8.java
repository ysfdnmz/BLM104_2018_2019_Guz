/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek8 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader f=new FileReader("c:\\dosyalar\\Merhaba.txt");
        int c;
        while ((c=f.read())!=-1){
            System.out.println(c);
        }
        System.out.println("");
    }
}
