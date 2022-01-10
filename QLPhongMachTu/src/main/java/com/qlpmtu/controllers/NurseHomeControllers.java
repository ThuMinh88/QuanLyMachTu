/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.PhieuKhamBenh;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.PhieuKhamBenhService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ACER
 */
@Controller
@ControllerAdvice
//@RequestMapping("/admin")
public class NurseHomeControllers {

    @Autowired
    private BenhNhanService benhNhanService;
    @Autowired
    private PhieuKhamBenhService phieuKhamBenhService;
    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/index-nurse")
    public String index(Model model) {
        model.addAttribute("cxn", this.phieuKhamBenhService.getPhieuChuaXNKhams());
        model.addAttribute("xn", this.phieuKhamBenhService.getPhieuXNKhams());
        return "index-nurse";
    }

    @ModelAttribute
    public void commonAttrs(Model model, HttpSession session) {
        model.addAttribute("currentUser", session.getAttribute("currentUser"));
        model.addAttribute("benhnhan", this.benhNhanService.getBenhNhans());
    }

    @RequestMapping(value = "index-nurse/accept/{idphieuKB}", method = RequestMethod.GET)
    public String accept(@PathVariable("idphieuKB") int id) {
        PhieuKhamBenh pkb = phieuKhamBenhService.getPhieuKhamBenhById(id);
        if (pkb != null) {
            this.phieuKhamBenhService.acceptPhieu(id);
            sendEmail("xasao4601@gmail.com", phieuKhamBenhService.getPhieuKhamBenhById(id).getBn_id().getEmail().toString(), "PHONG MACH TU OTC", "    Xin chào!!");
        }
        return "redirect:/index-nurse";
    }
    
    @RequestMapping(value = "index-nurse/del/{idphieuKB}", method = RequestMethod.GET)
    public String delPhieu(@PathVariable("idphieuKB") int id) {
        if(!phieuKhamBenhService.deletePhieu(id)){
//            benhNhanService
            return "/index-nurse";
        }
            
            
        return "redirect:/index-nurse";
    }
    
    public void sendEmail(String form, String to, String subject, String content) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom(form);
        email.setTo(to);
        email.setSubject(subject);
        email.setText(content);
        
        mailSender.send(email);
    }
}
