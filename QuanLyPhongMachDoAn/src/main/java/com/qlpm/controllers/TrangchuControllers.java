/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpm.controllers;

import java.util.jar.Attributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DAO
 */
@Controller 
public class TrangchuControllers {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name", "DAO");
        return "index";
    }
}
