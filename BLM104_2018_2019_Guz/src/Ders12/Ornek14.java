/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek14 {
    public static void main(String[] args) throws FileNotFoundException {
        String dosya="c:\\dosyalar\\sayilar.txt";
        Scanner s=new Scanner(new BufferedReader(new FileReader(dosya)));
        while(s.hasNext()){
             System.out.println(s.nextInt());
        }
         
    }
}
