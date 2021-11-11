/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.pojos.Thuoc;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DAO
 */
@Controller
@ControllerAdvice
public class HomeControllers {

    @Autowired
    private BenhNhanService benhNhanService;

    @Autowired
    private UserService userService;
    
    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

    @ModelAttribute
    public void commonAttrs(Model model, HttpSession session) {
        model.addAttribute("currentUser", session.getAttribute("currentUser"));
//        model.addAttribute("user", this.userService.getUsers());
    }

    @RequestMapping(value = "/appointment", method = RequestMethod.GET)
    public String appView(Model model) {
        model.addAttribute("benhnhan", new BenhNhan());
        return "appointment";
    }

    @PostMapping(value = "/appointment")
    public String appointment(Model model, @ModelAttribute(value = "benhnhan") BenhNhan bn,
            HttpSession session) {
        if (!this.benhNhanService.addName(bn)) {
            model.addAttribute("errMsg", "Loi!!");
            return "/appointment";
        }
        return "redirect:/";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

}
