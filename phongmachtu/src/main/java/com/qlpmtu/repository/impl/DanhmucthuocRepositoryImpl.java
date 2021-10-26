/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.Danhmucthuoc;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.qlpmtu.repository.DanhmucthuocRepository;

/**
 *
 * @author DAO
 */
@Repository
public class DanhmucthuocRepositoryImpl implements DanhmucthuocRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    @Transactional
    public List<Danhmucthuoc> getDanhmucthuoc() {
        Session s = sessionFactory.getObject().getCurrentSession();
       Query q = s.createQuery("From Danhmucthuoc");
       return q.getResultList();
    }
}
