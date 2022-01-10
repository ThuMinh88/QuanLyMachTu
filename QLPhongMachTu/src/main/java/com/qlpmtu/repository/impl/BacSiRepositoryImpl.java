/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.BacSi;
import com.qlpmtu.repository.BacSiRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ACER
 */
@Repository
@Transactional
public class BacSiRepositoryImpl implements BacSiRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<BacSi> getBacSis() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From BacSi");
        return q.getResultList();
    }

    @Override
    public BacSi getBSById(int bsID) {
        Session s = sessionFactory.getObject().getCurrentSession();
        return s.get(BacSi.class, bsID);
    }

    @Override
    public boolean addBs(BacSi bs) {
        Session s = sessionFactory.getObject().getCurrentSession();
        try{
            s.save(bs);
            return true;
        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteBs(int bsID) {
        try{
            Session s = sessionFactory.getObject().getCurrentSession();
            BacSi bs = s.get(BacSi.class, bsID);
            s.delete(bs);
            return true;
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        return false;
    }

}
