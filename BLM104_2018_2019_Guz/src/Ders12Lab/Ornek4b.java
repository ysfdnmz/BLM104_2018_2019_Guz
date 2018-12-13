/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import Ders11.Personel;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author anizam
 */
public class Ornek4b {
    public static void main(String[] args) throws FileNotFoundException {
        String dosya = "c:\\dosyalar\\personel.txt";
        Scanner f = new Scanner(new BufferedInputStream(new FileInputStream(dosya)));
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_GuzPU");
        EntityManager em=emf.createEntityManager();
       
        em.getTransaction().begin();
        while (f.hasNext()){
            int personelID=f.nextInt();
            String adi=f.next();
            int maas=f.nextInt();
            Query q=em.createQuery("update Personel p set p.maas=:pMaas where p.personelId=:pId");
            q.setParameter("pMaas", maas);
            q.setParameter("pId", personelID);
            q.executeUpdate();
        }
        em.getTransaction().commit();
        f.close();
        em.close();
        emf.close();
    }
}
