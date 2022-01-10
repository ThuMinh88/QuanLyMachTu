/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.pojos.DonThuoc;
import com.qlpmtu.pojos.PhieuKhamBenh;
import com.qlpmtu.pojos.Thuoc;
import com.qlpmtu.pojos.User;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.PhieuKhamBenhService;
import com.qlpmtu.service.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author DAO
 */
@Controller
@ControllerAdvice
@Transactional
public class HomeControllers {

    @Autowired
    private BenhNhanService benhNhanService;

    @Autowired
    private UserService userService;
    @Autowired
    private PhieuKhamBenhService phieuKhamBenhService;
    
    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

    
    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
    
    @ModelAttribute
    public void commonAttrs(Model model, HttpSession session) {
        model.addAttribute("currentUser", session.getAttribute("currentUser"));
    }
    
    @RequestMapping(value = "/appointment", method = RequestMethod.GET)
    public String appView(Model model) {
        model.addAttribute("benhnhan", new BenhNhan());
        return "appointment";
    }

    @PostMapping("/appointment")
    public String appointment(Model model, @ModelAttribute("benhnhan") BenhNhan bn,
            HttpSession session) {
        bn.setUserID(userService.getUserById(session.getId().hashCode()));
        if (this.benhNhanService.addName(bn)) {
            PhieuKhamBenh phieu = new PhieuKhamBenh();
            phieu.setBn_id(bn);
            phieu.setXacnhan(Boolean.FALSE);
            phieu.setKhambenh(Boolean.FALSE);
            this.phieuKhamBenhService.addPhieu(phieu);
            return "redirect:/";
        }
        else{
            model.addAttribute("errMsg", "Loi!!");
            return "/appointment";
        }
    }
    
//    @GetMapping("/index-doctor")
//    public String donThuoc(Model model, @RequestParam(value = "kw", required = false, defaultValue = "") String kw){
//         model.addAttribute("toathuoc", new DonThuoc());
////         model.addAttribute("ctdt", new ChiTietDonThuoc());
////        model.addAttribute("thuoc", this.thuocService.getThuocs(kw));
//        
//         return "index-doctor";
//     }


}
