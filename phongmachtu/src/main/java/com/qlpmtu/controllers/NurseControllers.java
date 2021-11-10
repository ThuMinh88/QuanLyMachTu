/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.User;
import com.qlpmtu.pojos.YTa;
import com.qlpmtu.service.UserService;
import com.qlpmtu.service.YTaService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author ACER
 */
@Controller
@Transactional
public class NurseControllers {

    @Autowired
    private UserService userService;
    @Autowired
    private YTaService yTaService;

    @ModelAttribute
    public void commonAttr(Model model){
//        model.addAttribute("user", this.userService.getUsers(username));
    }
    
    @GetMapping("admin-nurse")
    public String nurseAD(Model model) {
        model.addAttribute("yta", this.yTaService.getYTas());
        return "admin-nurse";
    }

    @RequestMapping(value = "create-nurse", method = RequestMethod.GET)
    public String nurseADView(Model model) {
        model.addAttribute("yta", new YTa());
        return "create-nurse";
    }

    @PostMapping("create-nurse")
    public String nurseADadd(Model model, @ModelAttribute(value = "yta") YTa yta) {
        if (!this.yTaService.addYTa(yta)) {
            model.addAttribute("errMsg", "Loi!!");
            return "/create-nurse";
        }       
        return "redirect:/admin-nurse";
    }

    @RequestMapping(value = "/admin-nurse/deleted/{idYT}", method = RequestMethod.GET)
    public String deleteNurse(@PathVariable("idYT") int id) {
        YTa yt = yTaService.getYTaById(id);
        if (yt != null) {
            this.yTaService.deleteYta(id);
        }
        return "redirect:/admin-nurse";
    }
//
//    @RequestMapping(value = "new-user", method = RequestMethod.GET)
//    public String newUser(Model model) {
//        model.addAttribute("user", new User());
//        return "new_user";
//    }
//
//    @PostMapping(value = "new-user")
//    public String postUser(Model model, @ModelAttribute User user) {
//        if (this.userService.addUser(user)) {
//            return "redirect:/admin-nurse";
//        }
//        model.addAttribute("errMsg", "Loi!!");
//        return "new_user";
//    }
}
