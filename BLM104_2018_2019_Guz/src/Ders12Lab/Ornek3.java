/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) throws FileNotFoundException {
        String dosya = "c:\\dosyalar\\sayilar.txt";
        Scanner f = new Scanner(new BufferedInputStream(new FileInputStream(dosya)));
        
        int toplam=0;
        while (f.hasNextInt()){
            toplam+=f.nextInt();
        }
        System.out.println("Toplam = " + toplam);
    }
}
