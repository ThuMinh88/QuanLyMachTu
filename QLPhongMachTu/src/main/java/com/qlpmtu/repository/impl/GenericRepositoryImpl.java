/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.repository.GenericRepository;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ACER
 * @param <Item>
 */

@Repository
public abstract class GenericRepositoryImpl<Item extends Serializable>  implements GenericRepository<Item>{
//public  class GenericRepositoryImpl<Item>  implements GenericRepository<Item>{
    @Autowired
    @Qualifier("getSessionFactory")
    private LocalSessionFactoryBean sessionFactory;

    protected Session currentSession() {
        return this.sessionFactory.getObject().getCurrentSession();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Item saveNew(Item s) {
        currentSession().save(s);
        return s;
    }
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    @Override
    public Item getById(Class<Item> type, Object id) {
        try {
            Item t = currentSession().get(type, (Serializable) id);
            return t;
        }
        catch (HibernateError e) {
            return null;
        }
    }
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    @Override
    public List<Item> getAll(Class<Item> type) {
        Query q = currentSession().createQuery("From " + type.getName());
        return q.getResultList();
    }
    
}
