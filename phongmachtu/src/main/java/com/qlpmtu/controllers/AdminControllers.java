/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.YTa;
import com.qlpmtu.service.BacSiService;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.DanhMucThuocService;
import com.qlpmtu.service.HoaDonService;
import com.qlpmtu.service.PhieuKhamBenhService;
import com.qlpmtu.service.ThuocService;
import com.qlpmtu.service.YTaService;
import java.text.NumberFormat;
import java.util.Locale;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ACER
 */
@Controller
@Transactional
@ControllerAdvice
//@RequestMapping("/admin")
public class AdminControllers {

    @Autowired
    private BenhNhanService benhNhanService;
    @Autowired
    private YTaService yTaService;
    @Autowired
    private HoaDonService hoaDonService;
    @Autowired
    private PhieuKhamBenhService phieuKhamBenhService;
//
//    @GetMapping("/")
//    public String indexPQ(Model model) {
//        return "admin";
//    }

    @ModelAttribute
    public void commonAttrs(Model model, HttpSession session) {
        model.addAttribute("currentUser", session.getAttribute("currentUser"));
    }

    @GetMapping("/admin-index")
    public String indexAD(Model model) {
        model.addAttribute("count", this.benhNhanService.countBenhNhan());
        model.addAttribute("countHoaDon", this.hoaDonService.coutHoaDon());
        model.addAttribute("countPCK", this.phieuKhamBenhService.countPhieuChuaKham());
        model.addAttribute("benhnhan", this.benhNhanService.getBenhNhans());
        
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getCurrencyInstance(localeVN);
        long longNumber = this.hoaDonService.sumPrice();
        String sum = vn.format(longNumber);
        model.addAttribute("sumPrice", sum + "VND");
        return "admin-index";
    }
}
