/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_GuzPU");
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Personel p=new Personel();
        p.setPersonelId(201);
        p.setAdi("Ahmet");
        p.setSoyadi("AK");
        p.setMaas(100000);
        
        em.persist(p);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
