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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ACER
 */
@Controller
//@RequestMapping("/admin")
public class AdminControllers {

    @Autowired
    private BacSiService bacSiService;
    @Autowired
    private BenhNhanService benhNhanService;
    @Autowired
    private DanhMucThuocService danhMucThuocService;
    @Autowired
    private ThuocService thuocService;

    @GetMapping("/admin-index")
    public String indexAD(Model model) {
        model.addAttribute("benhnhan", this.benhNhanService.getBenhNhans());
        return "admin-index";
    }

    @GetMapping("/login-admin")
    public String loginAD(Model model) {
        return "login-admin";
    }

    @GetMapping("/admin-doctor")
    public String doctorAD(Model model) {
        model.addAttribute("bacsi", this.bacSiService.getBacSis());
        return "admin-doctor";
    }
    
    
    @GetMapping("/admin-medicine")
    public String Thuoc(Model model, @RequestParam(value = "kw", required = false, defaultValue = "") String kw) {
        model.addAttribute("danhmucthuoc", this.danhMucThuocService.getDanhMucThuocs());
        model.addAttribute("thuoc", this.thuocService.getThuocs(kw));
        return "admin-medicine";
    }
    
    
    @Autowired
    private YTaService yTaService;
    
     @GetMapping("/admin-nurse")
     public String nurseAD(Model model){
         model.addAttribute("yta", this.yTaService.getYTas());
         return "admin-nurse";
     }
    @RequestMapping(value="/create-nurse", method = RequestMethod.GET)
    public String nurseADView(Model model) {
        model.addAttribute("yta", new YTa());
            return "create-nurse";
    }  
     @PostMapping("/create-nurse")
     public String nurseADadd(Model model, @ModelAttribute(value="yta") YTa yta){
         if(!this.yTaService.addYTa(yta)){
             model.addAttribute("errMsg", "Loi!!");
             return  "/create-nurse";
         }
         return "redirect:/admin-nurse";
     }
}
