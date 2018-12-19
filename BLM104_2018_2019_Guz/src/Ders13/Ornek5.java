/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String dosya = "c:\\dosyalar\\sayi.dat";
        DataInputStream f = new DataInputStream(new FileInputStream(dosya));
        while (f.available() > 0) {
            System.out.println(f.readInt());
        }

        f.close();

    }
}
