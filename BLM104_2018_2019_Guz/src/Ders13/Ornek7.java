/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
     public static void main(String[] args) throws FileNotFoundException, IOException {

        String dosya = "c:\\dosyalar\\personel.dat";
        DataInputStream f = new DataInputStream(new FileInputStream(dosya));
        while (f.available() > 0) {
            System.out.print(f.readUTF()+" ");
            System.out.println(f.readInt());
        }

        f.close();

    }
}
