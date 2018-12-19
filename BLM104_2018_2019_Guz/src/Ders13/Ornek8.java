/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import Ders11.Personel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
  // Nesnelerin dosyaya yazılması 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Araba a=new Araba("Mercedes", "G350", 1000000);
        ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream("c:\\dosyalar\\nesne.obj"));
        f.writeObject(a);
        f.writeObject(new Sofor("Ahmet","Ak"));
        f.writeObject(new Araba("BMW","20",2000000));
        f.writeObject(new Araba("Honda","CIVIC",50000));
        f.writeObject(new Sofor("Mehmet", "Sarı"));
        f.close();
    }
}
