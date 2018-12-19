/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\personel.dat";
        //DataOutputStream f=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dosya)));
        DataOutputStream f=new DataOutputStream(new FileOutputStream(dosya));
        f.writeUTF("Ahmet AK");
        f.writeInt(15000);
        f.writeUTF("Mehmet Yeşil");
        f.writeInt(20000);
        f.close();
    }
}
