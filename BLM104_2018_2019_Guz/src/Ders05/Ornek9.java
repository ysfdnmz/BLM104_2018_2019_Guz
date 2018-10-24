/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Ahmet geldi ");
        System.out.println(sb);
        System.out.println("Nereye geldi");
        sb.insert(6, "eve ");
        
        System.out.println(sb);
        sb.append(10);
        sb.append(" da");
        System.out.println(sb);
        
        System.out.println(sb.reverse());
    }
}
