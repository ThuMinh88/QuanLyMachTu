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
public class MedicineControllers {
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