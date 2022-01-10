/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.BacSi;
import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.pojos.User;
import com.qlpmtu.service.BacSiService;
import com.qlpmtu.service.DanhMucThuocService;
import com.qlpmtu.service.ThuocService;
import com.qlpmtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ACER
 */
@Controller
@Transactional
@RequestMapping("/admin")
public class DoctorControllers{
   @Autowired
   private BacSiService bacSiService;
    @Autowired
    private ThuocService thuocService;
    @Autowired
    private UserService userService;
    
    @GetMapping("/doctor")
    public String doctorAD(Model model) {
        model.addAttribute("bacsi", this.bacSiService.getBacSis());
        return "admin-doctor";
    }
    @RequestMapping(value="create-doctor",method = RequestMethod.GET)
    public String createView(Model model){
        model.addAttribute("taikhoan", this.userService.getUserById(5));
        model.addAttribute("bacsi", new BacSi());
        return "create-doctor";
    }
    @PostMapping("create-doctor")
    public String create(Model model, @ModelAttribute(value="bacsi") BacSi bs){
        if(!this.bacSiService.addBs(bs)){
            model.addAttribute("errMsg", "Có lỗi khi thêm!");
            return "/admin/create-doctor";
        }
            return "redirect:/admin/doctor";
    }
    @RequestMapping(value="/doctor/deleted/{idBS}",method = RequestMethod.GET)
    public String deleteDoctor(@PathVariable("idBS") int id){
        BacSi bs = bacSiService.getBSById(id);
        if(bs != null){
            this.bacSiService.deleteBs(id);
        }
        return "redirect:/admin/doctor";
    }
    

}
