/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.YTa;
import com.qlpmtu.service.BacSiService;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.DanhMucThuocService;
import com.qlpmtu.service.ThuocService;
import com.qlpmtu.service.YTaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ACER
 */
@Controller
@RequestMapping("/admin")
public class AdminControllers {

    
    @Autowired
    private BenhNhanService benhNhanService;
    @Autowired
    private YTaService yTaService;
    

    @GetMapping("/")
    public String indexAD(Model model) {
        model.addAttribute("benhnhan", this.benhNhanService.getBenhNhans());
        return "admin-index";
    }

    @GetMapping("/login-admin")
    public String loginAD(Model model) {
        return "login-admin";
    }


    //    @GetMapping("/admin-nurse")
    //    public String nurseADView(Model model) {
    //        model.addAttribute("yta", this.yTaService.getYTas());
    //        return "admin-nurse";
    //    }
    //
    //    @PostMapping("/admin-nurse")
    //    public String nurseADadd(Model model, @ModelAttribute(value = "yta") YTa yta, int ytaID) {
    //        if (!this.yTaService.addYTa(yta) || !this.yTaService.deleteYta(ytaID)) {
    //            model.addAttribute("errMsg", "Loi!!");
    //            return "/admin-nurse";
    //        }
    //        
    //        return "redirect:/admin-nurse";
    //    }
    
}
