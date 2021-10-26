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
import com.qlpmtu.service.DanhmucthuocService;


/**
 *
 * @author DAO
 */
@Controller 
public class TrangchuControllers {
   @Autowired
   private DanhmucthuocService danhmucthuocService; 
    
    @RequestMapping("/")
    public String index(Model model) {
       model.addAttribute("danhmucthuoc", this.danhmucthuocService.getDanhmucthuoc());
       return "index";
    }
}