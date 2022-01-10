/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.PhieuKhamBenh;
import com.qlpmtu.repository.PhieuKhamBenhRepository;
import java.time.Instant;
import java.util.Date;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.HibernateException;
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
    public long countPhieuChuaKham() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("SELECT Count(*) FROM PhieuKhamBenh phieukhambenh WHERE phieukhambenh.xacnhan = false");
        return Long.parseLong(q.getSingleResult().toString());
    }

    @Override
    public boolean addPhieu(PhieuKhamBenh pkb) {
        Session s = sessionFactory.getObject().getCurrentSession();
        try {
            pkb.setXacnhan(Boolean.FALSE);
            pkb.setKhambenh(Boolean.FALSE);
            pkb.setCreated_date(Date.from(Instant.now()));
            s.save(pkb);

            return true;
        } catch (Exception ex) {
            System.err.println("==ERROR==" + ex.getMessage());
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<PhieuKhamBenh> getPhieuChuaXNKhams() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM PhieuKhamBenh phieukhambenh WHERE phieukhambenh.xacnhan = false");
        return q.getResultList();
    }

    @Override
    public List<PhieuKhamBenh> getPhieuXNKhams() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM PhieuKhamBenh phieukhambenh WHERE phieukhambenh.xacnhan = true");
        return q.getResultList();
    }

    @Override
    public boolean acceptPhieu(int phieuID) {
        try {
            Session session = this.sessionFactory.getObject().getCurrentSession();
            PhieuKhamBenh p = session.get(PhieuKhamBenh.class, phieuID);
            p.setXacnhan(true);
            session.save(p);
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public PhieuKhamBenh getPhieuKhamBenhById(int i) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(PhieuKhamBenh.class, i);
    }

    @Override
    public List<PhieuKhamBenh> getPhieuChuaKhams() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM PhieuKhamBenh phieukhambenh WHERE phieukhambenh.khambenh = false and phieukhambenh.xacnhan = true");
        return q.getResultList();
    }

    @Override
    public boolean deletePhieu(int id) {
        try {
            Session session = this.sessionFactory.getObject().getCurrentSession();
            PhieuKhamBenh p = session.get(PhieuKhamBenh.class, id);
            session.delete(p);
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<PhieuKhamBenh> getPhieuDaKhams() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM PhieuKhamBenh phieukhambenh WHERE phieukhambenh.khambenh = true and phieukhambenh.xacnhan = true");
        return q.getResultList();
    }

}
