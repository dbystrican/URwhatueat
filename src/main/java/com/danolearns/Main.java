package com.danolearns;

import com.danolearns.orm.user.UserProfile;
import org.hibernate.Session;

import javax.persistence.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //testDb();
        testJPADb();
    }
    private static void testDb(){
        Session session = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
        }finally { 
            session.close();
        }
        /*UserProfile userProfile1= new UserProfile();
        userProfile1.setEmail();
        userProfile1*/
        
    }
    private static void testJPADb(){
        EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
                .createEntityManagerFactory("postgres");
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

        EntityTransaction et = null;
        try {
            // Get transaction and start
            //et = em.getTransaction();
            //et.begin();
            Query q = em.createNativeQuery("SELECT version();");
            Object version = q.getSingleResult();
            System.out.println("you are running verison "+version);
            //et.commit();
        } catch (Exception ex) {
            if (et != null) {
              //  et.rollback();
            }
            ex.printStackTrace();
        } finally {
            //em.close();
        }
    }
}
