        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.pojos.Thuoc;
import com.qlpmtu.pojos.User;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ACER
 */
@Controller
@Transactional
public class UserController {
    @Autowired
    private UserService userDetailsService;
    @Autowired 
    private BenhNhanService benhNhanService;

//    @Autowired
//    private WebAppValidator userValidator;
//    
//    @InitBinder
//    public void init(WebDataBinder binder) {
//        binder.setValidator(userValidator);
//    }
//    
    
     @GetMapping(value = "/login")
     public String login(Model model,  @ModelAttribute(value = "user") User user){
         model.addAttribute("User", new User());
        return "login";
     }
     
      @RequestMapping(value = "/register", method = RequestMethod.GET)
     public String registerView(Model model){
         model.addAttribute("taikhoan", new User());
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

     
// @PostMapping("/register")
//    public String register(Model model, 
//            @ModelAttribute(value = "user") @Valid User user, @ModelAttribute (value = "taikhoan") BenhNhan bn,
//            BindingResult result) {
//        if (result.hasErrors()) {
//            return "register";
//        }
//        
//        if (this.userDetailsService.addUser(user) == false || this.benhNhanService.addName(bn) == false)  {
//            model.addAttribute("errMsg", "Something wrong!!!");
//            return "register";
//        }
//            
//        
//        return "redirect:/login";
//    }
}
