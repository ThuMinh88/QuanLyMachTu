/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.ChiTietDonThuoc;
import com.qlpmtu.repository.ChiTietDonThuocRepository;
import com.qlpmtu.service.ChiTietDonThuocService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class ChiTietDonThuocServiceImpl implements ChiTietDonThuocService{
    @Autowired
    private ChiTietDonThuocRepository chiTietDonThuocRepository;    

    @Override
    public List<ChiTietDonThuoc> getChiTietDonThuocs() {
        return this.chiTietDonThuocRepository.getChiTietDonThuocs();
    }

    @Override
    public boolean addCTDT(ChiTietDonThuoc ctdt) {
        return this.chiTietDonThuocRepository.addCTDT(ctdt);
    }
    
}
