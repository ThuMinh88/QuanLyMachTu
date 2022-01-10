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
@RequestMapping("/admin")
public class PatientControllers {
    @Autowired
    private BenhNhanService benhNhanService;
    
    @GetMapping("patient")
    public  String BenhNhan(Model model){
        model.addAttribute("benhnhan", this.benhNhanService.getBenhNhans());
        return "admin-patient";
    }
    
}
