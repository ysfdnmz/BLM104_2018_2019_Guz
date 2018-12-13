/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import Ders11.Personel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_GuzPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select p from Personel p");
        List<Personel> calisanlar=q.getResultList();
        String dosya = "c:\\dosyalar\\personel.txt";

        BufferedWriter f=new BufferedWriter(new FileWriter(dosya));
        for (Personel c : calisanlar) {
            f.write(c.getPersonelId()+" "+c.getAdi()+" "+c.getMaas());
            f.newLine();
        }
        f.close();
        em.close();
        emf.close();
    }
}
