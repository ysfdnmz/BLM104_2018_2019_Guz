/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        try( FileOutputStream f=new FileOutputStream("c:\\dosyalar\\Merhaba.txt")) {
           String s="Ahmet AK"; 
           f.write(s.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
