/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab;

/**
 *
 * @author anizam
 */
public class Soru5 {

    public static void main(String[] args) {
        int dizi[][] = {{1, 3, 5}, {1, 0, 0}, {2, 0, 7}};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                try {
                    int k = 1 / dizi[i][j];
                } catch (ArithmeticException e) {
                    System.out.println(i + "- " + j);
                }
            }
        }
    }
}
