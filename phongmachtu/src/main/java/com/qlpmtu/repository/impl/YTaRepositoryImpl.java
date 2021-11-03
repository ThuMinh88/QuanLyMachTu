/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.YTa;
import com.qlpmtu.repository.YTaRepository;
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
public class YTaRepositoryImpl implements YTaRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<YTa> getYTas() {
        Session s = sessionFactory.getObject().getCurrentSession();
       Query q = s.createQuery("From YTa");
       return q.getResultList();
    }

    @Override
    public YTa getYTaById(int ytaID) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(YTa.class, ytaID);
    }
    
}
