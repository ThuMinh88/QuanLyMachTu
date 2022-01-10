/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.ChiTietCaKhamBenh;
import com.qlpmtu.repository.ChiTietCaKhamBenhRepository;
import com.qlpmtu.repository.GenericRepository;
import java.time.Instant;
import java.util.Date;
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
public class ChiTietCaKBRepositoryImpl implements ChiTietCaKhamBenhRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public boolean addCTCaKham(ChiTietCaKhamBenh ct) {
        Session s = sessionFactory.getObject().getCurrentSession();
        try{
            ct.setNgayKhamBenh(Date.from(Instant.now()));
            s.save(ct);
            return true;
        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<ChiTietCaKhamBenh> getChiTietCas() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From ChiTietCaKhamBenh");
        return q.getResultList();
    }

    @Override
    public ChiTietCaKhamBenh getCTCaById(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(ChiTietCaKhamBenh.class, id);
    }
}
