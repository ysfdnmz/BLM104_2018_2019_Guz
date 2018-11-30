/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        String adres="jdbc:derby://localhost:1527/sample";
        try(Connection con=DriverManager.getConnection(adres, "app","app")){
            Statement s=con.createStatement();
            String adi="AHMET";
            String soyadi="AK";
            String sqlSorgu="SELECT * FROM personel "
                    + "WHERE adi='"+adi+"' AND soyadi='"+soyadi+"'";
            System.out.println(sqlSorgu);
            ResultSet rs=s.executeQuery(sqlSorgu);
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
