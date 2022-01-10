/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.modelviews.DonThuocA;
import com.qlpmtu.pojos.BacSi;
import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.pojos.ChiTietDonThuoc;
import com.qlpmtu.pojos.DonThuoc;
import com.qlpmtu.pojos.PhieuKhamBenh;
import com.qlpmtu.service.BacSiService;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.ChiTietDonThuocService;
import com.qlpmtu.service.DonThuocService;
import com.qlpmtu.service.PhieuKhamBenhService;
import com.qlpmtu.service.ThuocService;
import com.qlpmtu.service.UserService;
import java.text.ParseException;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
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
@ControllerAdvice
@Transactional
public class DoctorHomeController {

    @Autowired
    private BenhNhanService benhNhanService;
    @Autowired
    private PhieuKhamBenhService phieuKhamBenhService;
    @Autowired
    private ThuocService thuocService;
    @Autowired
    private BacSiService bacSiService;
    @Autowired
    private DonThuocService donThuocService;
    @Autowired
    private UserService userService;
    @Autowired
    private ChiTietDonThuocService chiTietDonThuocService;

    @ModelAttribute
    public void commonAttrs(Model model, HttpSession session) {
        model.addAttribute("taikhoan", this.userService.getListUsers());
        model.addAttribute("bacsi", this.bacSiService.getBacSis());
        model.addAttribute("phieu", this.phieuKhamBenhService.getPhieuChuaKhams());
        model.addAttribute("currentUser", session.getAttribute("currentUser"));
        model.addAttribute("benhnhan", this.benhNhanService.getBenhNhans());
        model.addAttribute("benh", this.phieuKhamBenhService.getPhieuDaKhams());
    }
//
    @GetMapping(value="/index-doctor")
    public String donThuocI(Model model) {
        model.addAttribute("donthuoc", new DonThuocA());
        return "index-doctor";
    }
    @GetMapping(value="/index-doctor/medicine")
    public String thuocI(Model model, @RequestParam(value = "kw", required = false, defaultValue = "") String kw) {
        model.addAttribute("thuoc", this.thuocService.getThuocs(kw));
        return "medicine_doctor";
    }
    
    
//    @RequestMapping(value="/index-doctor/pres/{idBN}", method = RequestMethod.GET)
//    public String donThuoc(Model model) {
//        model.addAttribute("donthuoc", new DonThuocA());
//        return "index-doctor";
//    }
//    
//    @RequestMapping(value="/index-doctor/pres/{idBN}", method = RequestMethod.GET)
//    public String accept(@PathVariable("idBN") int id, @ModelAttribute("donthuocA") DonThuocA donthuoc) throws ParseException {
//        DonThuoc dt = new DonThuoc();
//        BenhNhan bn_id = benhNhanService.getBenhNhanById(id);
//        dt.setBn_id(bn_id);  
//        dt.setTrieuchung(bn_id.getTrieuChung());
//        dt.setBsi_id(donthuoc.getBacsi());
//        if (!this.donThuocService.addDonThuoc(dt))
//            return "/index-doctor";
//        return "redirect:/create_pres";
//    }

    
    
   @PostMapping("/index-doctor")
    public String accept(Model model,@ModelAttribute(value = "donthuoc") DonThuocA donthuoc) throws ParseException {
        DonThuoc dt = new DonThuoc();
        dt.setBn_id(donthuoc.getBenhnhan());
        dt.setTrieuchung(donthuoc.getTrieuchung());
        dt.setBsi_id(donthuoc.getBacsi());
        if (!this.donThuocService.addDonThuoc(dt)){
            model.addAttribute("errMsg", "Loi!!");
            return "/index-doctor";
        }
            
        return "redirect:/create_pres";
    }
//    
//        @PostMapping("/index-doctor")
//    public String addD(ModelMap model, @ModelAttribute(value = "donthuoc") DonThuoc dt,
//            @ModelAttribute(value = "ctdt") ChiTietDonThuoc ctdt) {
//
//        if (!this.chiTietDonThuocService.addCTDT(ctdt)) {
//            DonThuoc d = new DonThuoc();
//            d.setBn_id(ctdt.getDonthuoc().getBn_id());
//            d.setBsi_id(ctdt.getDonthuoc().getBsi_id());
//            if (!this.donThuocService.addDonThuoc(dt)) {
//                ChiTietDonThuoc ct = new ChiTietDonThuoc();
//                ct.setDonthuoc(dt);
//               if(!this.chiTietDonThuocService.addCTDT(ctdt)){
//                model.addAttribute("errMsg", "Loi!!");
//                return "/index-doctor";
//            }
////        }
//        return "redirect:/create_pres";
//    }
//    
    @GetMapping("/medical_record")
    public String benhAn(Model model) {
        model.addAttribute("benhnhan", this.phieuKhamBenhService.getPhieuXNKhams());
        return "medical_record";
    }
}
