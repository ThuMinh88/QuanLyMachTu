/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.Thuoc;
import com.qlpmtu.repository.ThuocRepository;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
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
@Transactional
public class ThuocRepositoryImpl implements ThuocRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Override
    public List<Thuoc> getThuocs(String kw) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Thuoc> query = builder.createQuery(Thuoc.class);
        Root root = query.from(Thuoc.class);
        query = query.select(root);
        
        if(!kw.isEmpty() && kw != null){
            Predicate p = builder.like(root.get("tenThuoc").as(String.class), 
                    String.format("%%%s%%", kw));
           query = query.where(p);
        }
        
        Query q = session.createQuery(query);
        return q.getResultList();
    }

    @Override
    public boolean addOrUpdate(Thuoc thuoc) {
        Session sesion = this.sessionFactory.getObject().getCurrentSession();
        try{
            if(thuoc.getNgayNhap() == null)
                thuoc.setNgayNhap(Date.from(Instant.now()));
            sesion.save(thuoc);
            return true;
             
        } catch(Exception ex){
            System.err.println("==ADD THUOC ERR" + ex.getMessage());
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteThuoc(int thuocID) {
        try {
                Session session = this.sessionFactory.getObject().getCurrentSession();
                Thuoc t = session.get(Thuoc.class,thuocID);
                session.delete(t);
                return true;
            
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    @Override
    public Thuoc getThuocById(int thuocID) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(Thuoc.class, thuocID);
    }

}
