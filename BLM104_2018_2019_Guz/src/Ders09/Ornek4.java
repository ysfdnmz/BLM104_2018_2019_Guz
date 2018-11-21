/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args)  {
        try {
            dosyaOku();
        } catch (IOException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void dosyaOku() throws IOException {
          FileWriter f=new FileWriter("c:\\dosyalar\\Merhaba.txt");
          f.write("Merhaba");
    }
    
}
