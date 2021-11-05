/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;


import com.qlpmtu.pojos.Thuoc;
import com.qlpmtu.service.DanhMucThuocService;
import com.qlpmtu.service.ThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
public class MedicineControllers {

    @Autowired
    private DanhMucThuocService danhMucThuocService;
    @Autowired
    private ThuocService thuocService;
    
    @GetMapping("/admin-medicine")
    public String Thuoc(Model model, @RequestParam(value = "kw", required = false, defaultValue = "") String kw) {
        model.addAttribute("danhmucthuoc", this.danhMucThuocService.getDanhMucThuocs());
        model.addAttribute("thuoc", this.thuocService.getThuocs(kw));
        return "admin-medicine";
    }
//    
//    @PostMapping("/admin-medicine")
//    public String add(@ModelAttribute(value="thuoc") @Valid Thuoc thuoc,
//            BindingResult result){
//        if(!result.hasErrors()){
//            
//        }
//        return "admin-medicine";
//    }
}
