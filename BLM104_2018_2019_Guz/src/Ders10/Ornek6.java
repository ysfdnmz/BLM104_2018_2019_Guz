/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
         String adres = "jdbc:derby://localhost:1527/sample";
        try (Connection con = DriverManager.getConnection(adres, "app", "app")) {
            DatabaseMetaData dbMetaData=con.getMetaData();
            System.out.println(dbMetaData.getDatabaseProductName());
            System.out.println(dbMetaData.getDatabaseProductVersion());
          
        } catch (Exception e) {
            System.out.println("Hata " + e.getMessage());

        }
    }
}
