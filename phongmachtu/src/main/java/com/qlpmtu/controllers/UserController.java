/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.pojos.User;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.UserService;
import com.qlpmtu.valitator.WebAppValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ACER
 */
@Controller
public class UserController {
    @Autowired
    private UserService userDetailsService;
    @Autowired 
    private BenhNhanService benhNhanService;

    @Autowired
    private WebAppValidator userValidator;
    
    @InitBinder
    public void init(WebDataBinder binder) {
        binder.setValidator(userValidator);
    }
    
    @GetMapping("/login")
     public String login(){
         return "login";
     }
     
     
      @GetMapping("/register")
     public String registerView(Model model){
         model.addAttribute("taikhoan", new User());
         model.addAttribute("benhnhan",new BenhNhan());
         return "register";
     }
     @PostMapping("/register")
     public String register(Model model, @ModelAttribute(value = "taikhoan") User user) {
        if (user.getPassword().isEmpty() 
                || !user.getPassword().equals(user.getConfirmPassword())) 
            model.addAttribute("errMsg", "Mật khẩu không khớp!!!");
        else {
            if (this.userDetailsService.addUser(user) == true) {
                return "redirect:/login";
            }
            
            model.addAttribute("errMsg", "Đăng kí không thành công!");
        }
        
        return "register";
    }
     
//     @PostMapping("/register")
//     public String register(Model model, @ModelAttribute(value = "taikhoan") User user,
//             @ModelAttribute(value="benhnhan") BenhNhan bn) {
//        if (user.getPassword().isEmpty() 
//                || !user.getPassword().equals(user.getConfirmPassword())) 
//            model.addAttribute("errMsg", "Mật khẩu không khớp!!!");
//        else {
//            if (this.userDetailsService.addUser(user) == true || this.benhNhanService.addName(bn)) {
//                return "redirect:/login";
//            }
//            
//            model.addAttribute("errMsg", "Đăng kí không thành công!");
//        }
//        
//        return "register";
//    }
}
