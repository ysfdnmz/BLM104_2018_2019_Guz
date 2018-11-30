/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
          
        String adres="jdbc:derby://localhost:1527/sample";
        try(Connection con=DriverManager.getConnection(adres, "app","app")){
            String sqlSorgu="SELECT * FROM personel WHERE adi=? AND soyadi=?";
            PreparedStatement s=con.prepareStatement(sqlSorgu);
            String adi="AHMET";
            String soyadi="AK";
            s.setString(1, adi);
            s.setString(2, soyadi);
            System.out.println(sqlSorgu);
            ResultSet rs=s.executeQuery();
            while(rs.next()){
                System.out.print(rs.getString("personel_id")+" ");
                System.out.print(rs.getString("adi")+" ");
                System.out.println("");
            }
        }catch(Exception e){
            System.out.println("Hata "+e.getMessage());
        }
    }

}
