/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;


import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qlpmtu.service.ThuocService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.qlpmtu.service.DanhMucThuocService;


/**
 *
 * @author DAO
 */
@Controller
public class TrangchuControllers {
   
     @GetMapping("/")
     public String indexAD(Model model){
         return "index";
     }
     
     @GetMapping("/admin-patient")
     public String patientAD(){
         return "admin-patient";
     }
     
     @GetMapping("/admin-doctor")
     public String doctorAD(){
         return "admin-doctor";
     }
     
     @GetMapping("/admin-nurse")
     public String nurseAD(){
         return "admin-nurse";
     }
     
     @GetMapping("/admin-medicine/")
     public String medicineAD(){
         return "admin-medicine";
     }
//     
//    @RequestMapping("/")
//    public String index(Model model) {
//       Session s = sessionFactory.getObject().openSession();
//       Query q = s.createQuery("From Danhmucthuoc");
//       model.addAttribute("danhmuct", q.getResultList());
//       s.close();
//       return "index";
//    }
     
}
