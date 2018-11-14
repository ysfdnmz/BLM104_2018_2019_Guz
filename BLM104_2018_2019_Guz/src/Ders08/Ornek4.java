/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("c:\\dosyalar\\Merhaba.txt");
            int c1=f.read();
            int c2=f.read();
            int c3=f.read();
            System.out.println((char)c1+" "+(char)c2+" "+(char)c3);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
