package com.training.demohibernate;

/**
 * Hello world!
 *
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.training.demohibernate.model.PersonInfo;


public class App 
{
    private static SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void main( String[] args )
    {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        System.out.println(sessionFactory);
        System.out.println(sessionFactory.isClosed());
        System.out.println( "Hello World!" );
        PersonInfo person = new PersonInfo();
        person.setPersonId(2);
        person.setFirstName("abc");
        person.setLastName("abc");
        System.out.println(person);
        
    }
}
