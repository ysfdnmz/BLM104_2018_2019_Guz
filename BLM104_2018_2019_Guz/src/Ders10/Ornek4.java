/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    //Unvan? bo? olanlar? siliniz.
    public static void main(String[] args) {
          String adres="jdbc:derby://localhost:1527/sample";
        try(Connection con=DriverManager.getConnection(adres, "app","app")){
            String sqlSorgu="DELETE FROM personel "
                    + " WHERE unvanno is NULL";
            PreparedStatement s=con.prepareStatement(sqlSorgu);
            System.out.println(sqlSorgu);
            int kayitSayi=s.executeUpdate();
            System.out.println("kayitSayi = "+kayitSayi);
        }catch(Exception e){
            System.out.println("Hata "+e.getMessage());
        }
    }
}
