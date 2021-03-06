/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.NhaCungCap;
import com.qlpmtu.repository.NhaCungCapRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DAO
 */
@Repository
public class NhaCungCapRepositoryImpl implements NhaCungCapRepository{

    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Override
    @Transactional
    public List<NhaCungCap> getNhaCungCaps() {
       Session s = sessionFactory.getObject().getCurrentSession();
       Query q = s.createQuery("From NhaCungCap");
       return q.getResultList();
    }
    
}
