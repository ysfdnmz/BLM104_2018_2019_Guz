/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream f = new FileInputStream("c:\\dosyalar\\Merhaba.txt");
        int c = f.read();
        while (c != -1) {
            System.out.print((char) c);
            c = f.read();
        }
        System.out.println("");
    }
}
