/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.HoaDon;
import com.qlpmtu.repository.HoaDonRepository;
import com.qlpmtu.service.HoaDonService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class HoaDonServiceImpl implements HoaDonService{

    @Autowired
    private HoaDonRepository hoaDonRepository;
    @Override
    public long coutHoaDon() {
        return this.hoaDonRepository.coutHoaDon();
    }

    @Override
    public long sumPrice() {
        return this.hoaDonRepository.sumPrice();
    }

    @Override
    public List<HoaDon> getHoaDons() {
        return this.hoaDonRepository.getHoaDons();
    }

    
}
