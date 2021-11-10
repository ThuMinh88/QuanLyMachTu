/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.service.BacSiService;
import com.qlpmtu.service.DanhMucThuocService;
import com.qlpmtu.service.ThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ACER
 */
@Controller
public class DoctorControllers{
   @Autowired
   private BacSiService bacSiService;
    @Autowired
    private ThuocService thuocService;
    
    @GetMapping("/admin-doctor")
    public String doctorAD(Model model) {
        model.addAttribute("bacsi", this.bacSiService.getBacSis());
        return "admin-doctor";
    }
     @GetMapping("/doctor-index")
    public String doctor(Model model, @RequestParam(value = "kw", required = false, defaultValue = "") String kw) {
         model.addAttribute("thuoc", this.thuocService.getThuocs(kw));
        return "doctor-index";
    }
}
