/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import Ders11.Personel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_GuzPU");
        EntityManager em=emf.createEntityManager();
        Query qUnvan=em.createQuery("select u from Unvan u");
     
        List<Unvan> unvanlar=qUnvan.getResultList();
        for (Unvan u : unvanlar) {
           
            System.out.println(u.getUnvanAdi());
            Query qPersonel=em.createQuery("select p from Personel p where p.unvanId=:pUnvanId");
            qPersonel.setParameter("pUnvanId", u.getUnvanId());
            List<Personel> personeller=qPersonel.getResultList();
            for (Personel p : personeller) {
                System.out.println("--> "+p.getAdi()+" "+p.getSoyadi());    
            }
            
            
        }
       
        
    }
}
