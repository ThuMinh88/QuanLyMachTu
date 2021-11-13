/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.PhieuKhamBenh;
import com.qlpmtu.repository.PhieuKhamBenhRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
public class PhieuKhamBenhRepositoryImpl implements PhieuKhamBenhRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<PhieuKhamBenh> getPhieuKhamBenhs() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("Form PhieuKhamBenh");
        return q.getResultList();
    }

    @Override
    public boolean addBNID(PhieuKhamBenh id) {
        Session s = sessionFactory.getObject().getCurrentSession();
        try {
            s.save(id);

            return true;
        } catch (Exception ex) {
            System.err.println("==ERROR==" + ex.getMessage());
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public long countPhieuChuaKham() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("SELECT Count(*) FROM PhieuKhamBenh phieukhambenh WHERE phieukhambenh.xacnhan = false");
        return Long.parseLong(q.getSingleResult().toString());
    }

}
