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
public class Ornek7 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity()+" - " + sb.length());
        sb=sb.append("Ahmet");
        System.out.println(sb.capacity()+" - " + sb.length());
        sb=sb.append("eve geldi mi ?");
        System.out.println(sb);
        System.out.println(sb.capacity()+" - " + sb.length());
    }
}
