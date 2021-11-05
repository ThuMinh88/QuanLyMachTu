/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.service.BenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ACER
 */
@Controller
public class AdminControllers {
    
    @Autowired
    private BenhNhanService benhNhanService;
     @GetMapping("/admin-index")
     public String indexAD(Model model){
         model.addAttribute("benhnhan", this.benhNhanService.getBenhNhans());
         return "admin-index";
     }
     
     @GetMapping("/login-admin")
     public String loginAD(Model model){
         return "login-admin";
     }
}
