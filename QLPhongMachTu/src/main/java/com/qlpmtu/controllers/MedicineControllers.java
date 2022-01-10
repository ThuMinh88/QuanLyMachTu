/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.Thuoc;
import com.qlpmtu.service.DanhMucThuocService;
import com.qlpmtu.service.NhaCungCapService;
import com.qlpmtu.service.ThuocService;
import java.text.ParseException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
@RequestMapping("/admin")
public class MedicineControllers {
//    

    @Autowired
    private DanhMucThuocService danhMucThuocService;
    @Autowired
    private ThuocService thuocService;
    @Autowired
    private NhaCungCapService nhaCungCapService;

    @ModelAttribute
    public void danhMuc(Model model) {
        model.addAttribute("danhmucthuoc", this.danhMucThuocService.getDanhMucThuocs());
        model.addAttribute("nhacungcap", this.nhaCungCapService.getNhaCungCaps());
    }

    @GetMapping("medicine")
    public String Thuoc(Model model, @RequestParam(value = "kw", required = false, defaultValue = "") String kw) {
        //model.addAttribute("danhmucthuoc", this.danhMucThuocService.getDanhMucThuocs());
        model.addAttribute("thuoc", this.thuocService.getThuocs(kw));

        return "admin-medicine";

    }

    @RequestMapping(value = "create-medicine", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("thuoc", new Thuoc());
        return "create-medicine";
    }

    @RequestMapping(path = "create-medicine", method = RequestMethod.POST)
    public String taoThuoc(Model model, @ModelAttribute(value = "thuoc") @Valid Thuoc thuoc, BindingResult result){
        if (!result.hasErrors()) {
            if (this.thuocService.addOrUpdate(thuoc) == true) {
                return "redirect:/admin/medicine";
            } else {
                model.addAttribute("errMsg", "Lỗi thêm thuốc!!!");
            }
        }
        return "create-medicine";
    }

    @RequestMapping(path = "medicine/deleted/{idThuoc}", method = RequestMethod.GET)
    public String deleteThuoc(@PathVariable("idThuoc") int id) {
        Thuoc t = thuocService.getThuocById(id);
        if (t != null) {
            this.thuocService.deleteThuoc(id);
        }
        return "redirect:/admin/medicine";

    }
}
