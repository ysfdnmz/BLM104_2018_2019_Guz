/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author alinizam
 */
public class Ornek10 {
     // Nesnelerin dosyadan okunması

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream f = new ObjectInputStream(new FileInputStream("c:\\dosyalar\\nesne.obj"));
        try {
            while (true) {
                Araba a = (Araba) f.readObject();
                System.out.println(a.marka + " " + a.model + " " + a.fiyat);
            }
        } catch (EOFException e) {
            System.out.println("Dosya okundu");
        } 
        f.close();
    }
}
