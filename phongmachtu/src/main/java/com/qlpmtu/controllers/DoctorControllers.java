/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.service.BacSiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ACER
 */
@Controller
public class DoctorControllers {
    @Autowired
    private BacSiService bacSiService;
    
    @GetMapping("/admin-doctor")
     public String doctorAD(Model model){
         model.addAttribute("bacsi", this.bacSiService.getBacSis());
         return "admin-doctor";
     }
}
