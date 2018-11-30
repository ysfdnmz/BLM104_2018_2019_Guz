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
public class Ornek5 {

    public static void main(String[] args) {

        String adres = "jdbc:derby://localhost:1527/sample";
        try (Connection con = DriverManager.getConnection(adres, "app", "app")) {
            con.setAutoCommit(false);
            String sqlUpdate = "UPDATE malzeme SET kalan=kalan-5 WHERE mal_id=10";
            PreparedStatement rsUpdate = con.prepareStatement(sqlUpdate);
            rsUpdate.executeUpdate();
            String sqlInsert = "INSERT INTO satis (sid,mal_id,adet) VALUES (6,10,5)";
            PreparedStatement psInsert = con.prepareStatement(sqlInsert);
            psInsert.executeUpdate();
            con.commit();
          
        } catch (Exception e) {
            System.out.println("Hata " + e.getMessage());

        }
    }
}
