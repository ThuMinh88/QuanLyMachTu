/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.ChiTietDonThuoc;
import com.qlpmtu.repository.ChiTietDonThuocRepository;
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
public class ChiTietDonThuocRepositoryImpl implements ChiTietDonThuocRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<ChiTietDonThuoc> getChiTietDonThuocs() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From ChiTietDonThuoc");
        return q.getResultList();
    }

    @Override
    public boolean addCTDT(ChiTietDonThuoc ctdt) {
        Session s = sessionFactory.getObject().getCurrentSession();
        try{
            s.save(ctdt);
            return true;
        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    
}
