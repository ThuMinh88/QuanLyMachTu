/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;


import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author DAO
 */
@Controller
public class HomeControllers {
   
     @GetMapping("/")
     public String index(Model model){
         return "index";
     }
     
     @GetMapping("/appointment")
     public String appointment(Model model, HttpSession session){
         model.addAttribute("currentUser", session.getAttribute("currentUser"));
         return "appointment";
     }
     


}