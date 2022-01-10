/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.DonThuoc;
import com.qlpmtu.repository.DonThuocRepository;
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
public class DonThuocRepositoryImpl implements DonThuocRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<DonThuoc> getDonThuocs() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From DonThuoc");
        return q.getResultList();
    }

    @Override
    public boolean addDonThuoc(DonThuoc donThuoc) {
        Session s = sessionFactory.getObject().getCurrentSession();
        try{
            s.save(donThuoc);
            return true;
        }
        catch (HibernateException ex){
            ex.printStackTrace();
            s.flush();
        }
        return false;
    }

//    @Override
//    public DonThuoc getDonThuocLast(int idDT) {
//        Session s = sessionFactory.getObject().getCurrentSession();
//        Query q = s.createQuery("SELECT MAX(idDT) FROM qlpm.donthuoc");
//        return  q.getFirstResult();
//    }
    
}
