/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.ChiTietCaKhamBenh;
import com.qlpmtu.repository.ChiTietCaKhamBenhRepository;
import com.qlpmtu.service.ChiTietCaKBService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class ChiTietCaKBServiceImpl implements ChiTietCaKBService{
    @Autowired
    private ChiTietCaKhamBenhRepository chiTietCaKhamBenhRepository;
    
    @Override
    public boolean addCTCaKham(ChiTietCaKhamBenh ctckb) {
        return this.chiTietCaKhamBenhRepository.addCTCaKham(ctckb);
    }

    @Override
    public List<ChiTietCaKhamBenh> getChiTietCas() {
        return this.chiTietCaKhamBenhRepository.getChiTietCas();
    }

}
