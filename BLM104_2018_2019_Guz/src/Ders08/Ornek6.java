/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author anizam
 */
public class Ornek6 {

    public static void main(String[] args) {
        System.out.println("Main çal??t?");
        birMetot();
        System.out.println("Main ba?ar?l? bitti.");
    }

    static void birMetot() {
        System.out.println("Bir metot çal??t?");
        try {
            ikiMetot();
            System.out.println("Bir metot ba?ar?l? bitti");
        } catch (Exception e) {
            System.out.println("Bir metot yakalad?");
        }
    }

    static void ikiMetot() {
        System.out.println("En alt metot  çal??t?");
        int i = 1 / 0;
        System.out.println("En alt metot ba?ar?l? bitti");

    }

}
