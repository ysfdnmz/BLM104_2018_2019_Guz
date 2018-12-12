/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("c:\\dosyalar\\merhaba.txt");
        f.write("Merhaba Ahmet AK");
        f.close();
    }
}
