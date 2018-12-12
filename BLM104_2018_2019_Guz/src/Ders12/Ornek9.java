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
public class Ornek9 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader f = new FileReader("c:\\dosyalar\\Merhaba.txt");
        char [] okunanlar=new char[100];
        f.read(okunanlar);
        for (char p : okunanlar) {
            if ((int)p==-1) break;
            System.out.println(p);
        }
        System.out.println("");

    }
}
