/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_GuzPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select p from Personel p");
        List<Personel> personeller=q.getResultList();
        
        for (Personel p : personeller) {
            System.out.println(p.getAdi()+" "+p.getMaas()+" "+p.getUnvanno());
        }
        
        
        
    }
}
