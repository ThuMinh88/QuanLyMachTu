/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository.impl;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.pojos.ChiTietDonThuoc;
import com.qlpmtu.pojos.DonThuoc;
import com.qlpmtu.pojos.Thuoc;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import com.qlpmtu.repository.ReportRepository;
import javax.transaction.Transactional;

/**
 *
 * @author DAO
 */
@Repository
@Transactional
public class ReportRepositoryImpl implements ReportRepository{

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<Object[]> patientStats( Date fromDate, Date toDate) {
            Session session = this.sessionFactory.getObject().getCurrentSession();
            
            CriteriaBuilder a = session.getCriteriaBuilder();
            CriteriaQuery<Object[]> q = a.createQuery(Object[].class);
            
            Root rootBN = q.from(BenhNhan.class);
            Root rootDT = q.from(DonThuoc.class);
            
            List<Predicate> predicates = new ArrayList<>();
            
            predicates.add( a.equal(rootDT.get("bn_id"), rootBN.get("idBN")));
            
            q.multiselect(a.function("MONTH", Integer.class, rootDT.get("ngayketoa")),
                    a.function("YEAR", Integer.class, rootDT.get("ngayketoa")),
                    a.count(rootBN.get("idBN")));
            
             if(fromDate != null)
                 predicates.add(a.greaterThanOrEqualTo(rootDT.get("ngayketoa"), fromDate));
             if(toDate != null)
                 predicates.add(a.lessThanOrEqualTo(rootDT.get("ngayketoa"), toDate));
            
             q.where(predicates.toArray(new Predicate[] {}));
             q.groupBy(a.function("MONTH", Integer.class, rootDT.get("ngayketoa")),
                    a.function("YEAR", Integer.class, rootDT.get("ngayketoa"))
                    );
              
            Query query = session.createQuery(q);
            
        return query.getResultList();    
    }

    @Override
    public List<Object[]> billStats( Date fromDate, Date toDate) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
            
            CriteriaBuilder a = session.getCriteriaBuilder();
            CriteriaQuery<Object[]> q = a.createQuery(Object[].class);
            
            Root rootT = q.from(Thuoc.class);
            Root rootDT = q.from(DonThuoc.class);
            Root rootCTDT = q.from(ChiTietDonThuoc.class);
            
            List<Predicate> predicates = new ArrayList<>();
            predicates.add( a.equal(rootCTDT.get("donthuoc"), rootDT.get("idDT")));
            predicates.add(a.equal(rootCTDT.get("thuoc"), rootT.get("idThuoc")));
            
            q.multiselect(a.function("MONTH", Integer.class, rootDT.get("ngayketoa")),
                    a.function("YEAR", Integer.class, rootDT.get("ngayketoa")),
                    a.sum(a.prod(rootCTDT.get("dongia"), rootCTDT.get("soluong"))));
            
             if(fromDate != null)
                 predicates.add(a.greaterThanOrEqualTo(rootDT.get("ngayketoa"), fromDate));
             if(toDate != null)
                 predicates.add(a.lessThanOrEqualTo(rootDT.get("ngayketoa"), toDate));
            
             q.where(predicates.toArray(new Predicate[] {}));
             q.groupBy(a.function("MONTH", Integer.class, rootDT.get("ngayketoa")),
                    a.function("YEAR", Integer.class, rootDT.get("ngayketoa")));
              
              
            Query query = session.createQuery(q);
            
        return query.getResultList();    
    }
    
  

    
}
