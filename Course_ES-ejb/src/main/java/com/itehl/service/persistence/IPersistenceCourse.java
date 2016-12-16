/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.persistence;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bryan.silva
 */
@Local
public interface IPersistenceCourse {

    public List<?> createQuery(Class<?> entityClass, String namedQuery);
    public List<?> createQuery(Class<?> entityClass, String namedQuery, Object o);
    public List<?> createQuery(Class<?> entityClass, String namedQuery, Object [] o);
    public boolean createQueryInsert(Object o);
    public boolean createQueryUpdate(Object o);
    public boolean createQueryRemove(Object o, Object PK);

}
