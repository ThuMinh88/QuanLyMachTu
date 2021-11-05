/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.repository.BenhNhanRepository;
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
public class BenhNhanRepositoryImpl implements BenhNhanRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<BenhNhan> getBenhNhans() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From BenhNhan");
        return q.getResultList();
    }

    @Override
    public boolean addName(BenhNhan bn) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        try {
            session.save(bn);
            
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        
        return false;
    }

    @Override
    public BenhNhan getBenhNhanById(int i) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        
        return session.get(BenhNhan.class, i);
    }

}
