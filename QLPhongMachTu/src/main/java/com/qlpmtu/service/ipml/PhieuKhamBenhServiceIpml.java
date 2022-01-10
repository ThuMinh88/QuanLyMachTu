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
    public long countPhieuChuaKham() {
        return this.phieuKhamBenhRepository.countPhieuChuaKham();
    }

    @Override
    public boolean addPhieu(PhieuKhamBenh pkb) {
        return this.phieuKhamBenhRepository.addPhieu(pkb);
    }

    @Override
    public List<PhieuKhamBenh> getPhieuChuaXNKhams() {
        return this.phieuKhamBenhRepository.getPhieuChuaXNKhams();
    }

    @Override
    public List<PhieuKhamBenh> getPhieuXNKhams() {
        return  this.phieuKhamBenhRepository.getPhieuXNKhams();
    }

    @Override
    public boolean acceptPhieu(int i) {
        return this.phieuKhamBenhRepository.acceptPhieu(i);
    }

    @Override
    public PhieuKhamBenh getPhieuKhamBenhById(int i) {
        return this.phieuKhamBenhRepository.getPhieuKhamBenhById(i);
    }

    @Override
    public List<PhieuKhamBenh> getPhieuChuaKhams() {
        return this.phieuKhamBenhRepository.getPhieuChuaKhams();
    }

    @Override
    public boolean deletePhieu(int i) {
        return this.phieuKhamBenhRepository.deletePhieu(i);
    }

    @Override
    public List<PhieuKhamBenh> getPhieuDaKhams() {
        return this.phieuKhamBenhRepository.getPhieuDaKhams();
    }
    
}
