/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.pojos.ChiTietDonThuoc;
import com.qlpmtu.pojos.DonThuoc;
import com.qlpmtu.pojos.HoaDon;
import com.qlpmtu.repository.BaoCaoRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
public class BaoCaoRepositoryImpl implements BaoCaoRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFatory;

//    @Override
//    public List<Object[]> CateBaoCaos() {
//        Session session = this.sessionFatory.getObject().getCurrentSession();
//        
//        CriteriaBuilder b = session.getCriteriaBuilder();
//        CriteriaQuery<Object[]> q = b.createQuery(Object[].class);
//        
//        Root rootHD = q.from(HoaDon.class);
//        
//        q.where(b.equal(, rootHD))
//        
//    }

    @Override
    public List<Object[]> patientStats(String kw, Date formDate, Date toDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object[]> billStats(String kw, Date formDate, Date toDate) {
//        Session session = this.sessionFatory.getObject().getCurrentSession();
//        
//        CriteriaBuilder b = session.getCriteriaBuilder();
//        CriteriaQuery<Object[]> q = b.createQuery(Object[].class);
//        
//        Root rootHD = q.from(HoaDon.class);
//        Root rootCT = q.from(ChiTietDonThuoc.class);
//        Root rootDT = q.from(DonThuoc.class);
//        
//        List<Predicate> predicates = new ArrayList<>();
//        predicates.add(b.equal(rootCT.get("donthuoc"), rootDT.get("idDT")));
//        predicates.add(b.equal(rootHD.get("donThuocID"), rootDT.get("idDT")));
//        
//        q.multiselect(rootHD.get())
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
