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

/*
JDBC ile Veritabanından data okumak için yapılan örnek
*/

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        String adres="jdbc:derby://localhost:1527/sample";
        //Veritabanı ile bağlantı kuruluyor. verilen 3 parametreden birisi adres diğer ikisi id ve şifre bu sayede con objesi ile connectionu yönetebiliyoruz.
        try(Connection con=DriverManager.getConnection(adres, "app","app")){

            //Statement oluşturuluyor.
            Statement s=con.createStatement();
            String adi="AHMET";
            String soyadi="AK";
            //Yapacağımız SQL sorgusunu bir stringe yazıyoruz dilersek diğer sqlSorgu gördüğümüz yere de bu stringi yazabiliriz.
            String sqlSorgu="SELECT * FROM personel "+ "WHERE adi='"+adi+"' AND soyadi='"+soyadi+"'";

            System.out.println(sqlSorgu);// bu blok test amaçlı yazılmış.

            //executeQuery ile yaptığımız sql sorgularını bir ResultSet'te tutuyoruz.
            ResultSet rs=s.executeQuery(sqlSorgu);

            //next metodu ResultSet içindeki verileri sırayla dolaşmamıza yarıyor.
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
