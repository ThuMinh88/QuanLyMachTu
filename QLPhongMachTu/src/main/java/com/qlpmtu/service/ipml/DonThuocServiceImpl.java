/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.DonThuoc;
import com.qlpmtu.repository.DonThuocRepository;
import com.qlpmtu.service.DonThuocService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class DonThuocServiceImpl implements DonThuocService{
    @Autowired
    private DonThuocRepository donThuocRepository;

    @Override
    public List<DonThuoc> getDonThuocs() {
        return this.donThuocRepository.getDonThuocs();
    }

    @Override
    public boolean addDonThuoc(DonThuoc donThuoc) {
        return this.donThuocRepository.addDonThuoc(donThuoc);
    }
    
}
