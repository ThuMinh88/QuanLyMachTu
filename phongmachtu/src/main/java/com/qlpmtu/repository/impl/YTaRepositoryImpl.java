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
public class YTaRepositoryImpl implements YTaRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<YTa> getYTas() {
        Session s = sessionFactory.getObject().getCurrentSession();
       Query q = s.createQuery("From YTa");
       return q.getResultList();
    }

    @Override
    @Transactional
    public YTa getYTaById(int ytaID) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(YTa.class, ytaID);
    }

    @Override
    @Transactional
    public boolean addYTa(YTa yt) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try{
            s.save(yt);
            return true;
        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return false;
    }
    @Override
    @Transactional
    public boolean deleteYta(int ytaID){
        try{
            Session session = this.sessionFactory.getObject().getCurrentSession();
            YTa y = session.get(YTa.class, ytaID);
            session.delete(y);
            return true;
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        }
        return false;
    }
}
