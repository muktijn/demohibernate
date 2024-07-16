package com.training.demohibernate.Repository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.demohibernate.model.PersonInfo;

public class PersonInfoDAO {
    private SessionFactory sessionFactory;

    public PersonInfoDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Integer savePersonInfo(PersonInfo personInfo) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Integer id = null;
        try {
            transaction = session.beginTransaction();
            id = (Integer) session.save(personInfo);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction != null) transaction.rollback();
            throw e; // Or handle it via logging
        } finally {
            session.close();
        }
        return id;
    }

    public PersonInfo getPersonInfo(Integer id) {
        Session session = sessionFactory.openSession();
        try {
            return session.get(PersonInfo.class, id);
        } finally {
            session.close();
        }
    }

    public void updatePersonInfo(PersonInfo personInfo) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(personInfo);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction != null) transaction.rollback();
            throw e; // Or handle it via logging
        } finally {
            session.close();
        }
    }

    public void deletePersonInfo(PersonInfo personInfo) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(personInfo);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction != null) transaction.rollback();
            throw e; // Or handle it via logging
        } finally {
            session.close();
        }
    }
}