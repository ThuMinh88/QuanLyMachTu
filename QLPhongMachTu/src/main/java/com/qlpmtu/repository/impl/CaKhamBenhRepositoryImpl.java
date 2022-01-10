/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.CaKhamBenh;
import com.qlpmtu.repository.CaKhamBenhRepository;
import java.util.List;
import javax.persistence.Query;
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
public class CaKhamBenhRepositoryImpl implements CaKhamBenhRepository{

    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public CaKhamBenh getCaById(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(CaKhamBenh.class, id);
    }

    @Override
    public List<CaKhamBenh> getCaKhams() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From CaKhamBenh");
        return q.getResultList();
    }
    
}
