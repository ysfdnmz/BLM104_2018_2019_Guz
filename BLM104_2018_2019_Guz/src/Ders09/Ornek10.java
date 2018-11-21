/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anizam
 */
public class Ornek10 {
    public static void main(String[] args) throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("SELECT * FROM customer");
        while(rs.next()){
            System.out.println(rs.getString("customer_id") +" "+rs.getString("name"));
        }
        rs.close();
        con.close();
        
    }
 
}
