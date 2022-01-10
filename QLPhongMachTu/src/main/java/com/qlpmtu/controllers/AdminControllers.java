/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.controllers;

import com.qlpmtu.pojos.ChiTietCaKhamBenh;
import com.qlpmtu.pojos.YTa;
import com.qlpmtu.service.BacSiService;
import com.qlpmtu.service.BenhNhanService;
import com.qlpmtu.service.CaKhamBenhService;
import com.qlpmtu.service.ChiTietCaKBService;
import com.qlpmtu.service.DanhMucThuocService;
import com.qlpmtu.service.HoaDonService;
import com.qlpmtu.service.PhieuKhamBenhService;
import com.qlpmtu.service.ReportService;
import com.qlpmtu.service.ThuocService;
import com.qlpmtu.service.YTaService;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
@ControllerAdvice
@RequestMapping("/admin")
public class AdminControllers {

    @Autowired
    private BenhNhanService benhNhanService;
    @Autowired
    private YTaService yTaService;
    @Autowired
    private HoaDonService hoaDonService;
    @Autowired
    private PhieuKhamBenhService phieuKhamBenhService;
    @Autowired
    private CaKhamBenhService caKhamBenhService;
    @Autowired
    private BacSiService bacSiService;
    @Autowired
    private ChiTietCaKBService chiTietCaKBService;
    @Autowired
    private ReportService reportService;
//
//    @GetMapping("/")
//    public String indexPQ(Model model) {
//        return "admin";
//    }

    @ModelAttribute
    public void commonAttrs(Model model, HttpSession session) {
        model.addAttribute("currentUser", session.getAttribute("currentUser"));
        model.addAttribute("catruc", this.caKhamBenhService.getCaKhams());
        model.addAttribute("bacsi", this.bacSiService.getBacSis());
        model.addAttribute("chitietcakhambenh", this.chiTietCaKBService.getChiTietCas());
    }

    @GetMapping("/index")
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
        return "index-admin";
    }
    
//    @RequestMapping(value="/doctor-schedule/add/{idCa}", method = RequestMethod.GET)
//    public String doctorSchedule(Model model, @ModelAttribute("chitietcakham") ChiTietCaKhamBenh ct,HttpSession session) { 
//        if (!this.chiTietCaKBService.addCTCaKham(ct)) {
//                model.addAttribute("errMsg", "Loi!!");
//                return "/doctor-schedule";
//            }
//        return "index-admin"; 
//    }
    
    @GetMapping("/doctor-schedule")
    public String doctorSchedule(Model model) { 
        model.addAttribute("chitietcakham", new ChiTietCaKhamBenh());
        return "scheDoctor";
    }
    
    @PostMapping("/doctor-schedule")
    public String setScheD(ModelMap model, @ModelAttribute("chitietcakham") ChiTietCaKhamBenh ct){
        if(!chiTietCaKBService.addCTCaKham(ct)){
            return "/admin";
        }
        return "/admin/doctor-schedule/";
    }
//    
    @GetMapping("/report/patient")
    public  String patientStats(Model model, @RequestParam(required = false) Map<String, String> params){
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date fromDate = null, toDate= null;
        try {
            String from = params.getOrDefault("fromDate", null);
            if(from != null)
                fromDate = f.parse(from);
            
            String to = params.getOrDefault("toDate", null);
            if(to != null)
                toDate = f.parse(to);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
       
        model.addAttribute("patientMonthStats", this.reportService.patientStats(fromDate, toDate));
        return "report_patient";
    }
   @GetMapping("/report/bill")
    public  String billStats(Model model, @RequestParam(required = false) Map<String, String> params){
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date fromDate = null, toDate= null;
        try {
            String from = params.getOrDefault("fromDate", null);
            if(from != null)
                fromDate = f.parse(from);
            
            String to = params.getOrDefault("toDate", null);
            if(to != null)
                toDate = f.parse(to);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
//       
        model.addAttribute("billMonthStats", this.reportService.billStats(fromDate, toDate));
        return "report_bill";
    }
    
}
