package com.training.demohibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.training.demohibernate.model.PersonInfo;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the Configuration instance
            Configuration configuration = new Configuration();

            // Configure using the hibernate.cfg.xml
            configuration.configure("hibernate.cfg.xml");

            // Add our annotated class
            configuration.addAnnotatedClass(PersonInfo.class);

            // ServiceRegistry is needed since Hibernate 4.3
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            // Build and return a SessionFactory from the Configuration
            return configuration.buildSessionFactory(serviceRegistry);
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