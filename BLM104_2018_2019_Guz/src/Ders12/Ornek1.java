/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_GuzPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select c from Calisan c where UPPER(c.adi)=:pAdi");
        q.setParameter("pAdi", "AHMET");
        List<Calisan> calisanlar=q.getResultList();
        em.getTransaction().begin();
        for (Calisan c : calisanlar) {
            System.out.println(c.getAdi()+" "+c.getSoyadi());
            c.setMaas(10000);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
}
