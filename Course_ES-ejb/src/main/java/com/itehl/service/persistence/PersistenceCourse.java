/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.persistence;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author bryan.silva
 */
@Stateless
@Local(IPersistenceCourse.class)
public class PersistenceCourse implements IPersistenceCourse {

    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Course_JPA");
    EntityManager entitymanager = emfactory.createEntityManager();

    @Override
    public List<?> createQuery(Class<?> entityClass, String namedQuery) {
        List<?> list = null;
        try {
            Query query = entitymanager.createNamedQuery(namedQuery, entityClass);
            list = query.getResultList();

        } catch (Exception e) {
            System.out.println("Persistence.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<?> createQuery(Class<?> entityClass, String namedQuery, Object o) {
        List<?> list = null;
        try {
            Query query = entitymanager.createNamedQuery(namedQuery, entityClass).setParameter("request", o);
            list = query.getResultList();

        } catch (Exception e) {
            System.out.println("Persistence.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<?> createQuery(Class<?> entityClass, String namedQuery, Object [] o) {
        List<?> list = null;
        try {
            Query query = entitymanager.createNamedQuery(namedQuery, entityClass).setParameter("request", o[0])
                                                                                    .setParameter("request2", o[1]);
            list = query.getResultList();

        } catch (Exception e) {
            System.out.println("Persistence.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean createQueryInsert(Object o) {
        boolean status = false;
        try {
            entitymanager.getTransaction().begin();
            entitymanager.persist(o);
            entitymanager.getTransaction().commit();
            status = true;
        } catch (Exception e) {
            System.out.println("Persistence.. Not found!!");
            e.printStackTrace();
        }

        return status;
    }
    
    @Override
    public boolean createQueryUpdate(Object o) {
        boolean status = false;
        try {
            entitymanager.getTransaction().begin();
            entitymanager.merge(o);
            entitymanager.getTransaction().commit();
            status = true;
        } catch (Exception e) {
            System.out.println("Persistence.. Not found!!");
            e.printStackTrace();
        }

        return status;
    }
    
    @Override
    public boolean createQueryRemove(Object o, Object PK) {
        boolean status = false;
        try {
            entitymanager.getTransaction().begin();
            o = entitymanager.getReference(o.getClass(), PK);
            entitymanager.remove(o);
            entitymanager.getTransaction().commit();
            status = true;
        } catch (Exception e) {
            System.out.println("Persistence.. Not found!!");
            e.printStackTrace();
        }

        return status;
    }
}
