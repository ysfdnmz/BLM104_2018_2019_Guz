/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_GuzPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select p from Personel p");
        Personel p=(Personel)q.getResultList().get(0);
        em.getTransaction().begin();

        em.persist(p);
        p.setAdi("Mahmut");
        em.getTransaction().commit();
        
    }
}
