/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.PhieuKhamBenh;
import com.qlpmtu.repository.PhieuKhamBenhRepository;
import com.qlpmtu.service.PhieuKhamBenhService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class PhieuKhamBenhServiceIpml implements PhieuKhamBenhService{
    @Autowired
    private PhieuKhamBenhRepository phieuKhamBenhRepository;

    @Override
    public List<PhieuKhamBenh> getPhieuKhamBenhs() {
        return this.phieuKhamBenhRepository.getPhieuKhamBenhs();
    }

    @Override
    public boolean addBNID(PhieuKhamBenh id) {
        return this.phieuKhamBenhRepository.addBNID(id);
    }

    @Override
    public long countPhieuChuaKham() {
        return this.phieuKhamBenhRepository.countPhieuChuaKham();
    }
    
}
