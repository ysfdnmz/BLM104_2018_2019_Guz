/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01_Lab;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        JFrame ekran=new JFrame("Merhaba");
        JLabel etiket=new JLabel("Etiket");
        JButton buton=new JButton("Buton");
        JTextField metin=new JTextField("Metin");
        
        ekran.add(etiket);
        ekran.add(buton);
        ekran.add(metin);
        
        ekran.setLayout(new FlowLayout());
        ekran.setVisible(true);
        ekran.setSize(300,300);
    }
}
