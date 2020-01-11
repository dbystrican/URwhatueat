package com.danolearns;

import com.danolearns.orm.diet.*;
import com.danolearns.orm.user.GoogleLogin;
import com.danolearns.orm.user.UserDailyRecords;
import com.danolearns.orm.user.UserDiet;
import com.danolearns.orm.user.UserProfile;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//Todo needs to be replaced with JPA abstract
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration().configure("/resources/hibernate.cfg.xml")
                            .addAnnotatedClass(Diet.class)
                            .addAnnotatedClass(DietDay.class)
                            .addAnnotatedClass(DietDietDay.class)
                            .addAnnotatedClass(DietDietDayCompositeID.class)
                            .addAnnotatedClass(DietFriendliness.class)
                            .addAnnotatedClass(DietType.class)
                            .addAnnotatedClass(GoogleLogin.class)
                            .addAnnotatedClass(UserDailyRecords.class)
                            .addAnnotatedClass(UserDiet.class)
                            .addAnnotatedClass(UserProfile.class);


            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

}