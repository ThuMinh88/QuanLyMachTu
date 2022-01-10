/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.CaKhamBenh;
import com.qlpmtu.repository.CaKhamBenhRepository;
import com.qlpmtu.service.CaKhamBenhService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class CaKhamBenhServiceImpl implements CaKhamBenhService {

    @Autowired
    private CaKhamBenhRepository caKhamBenhRepository;

    @Override
    public CaKhamBenh getCaById(int id) {
        return this.caKhamBenhRepository.getCaById(id);
    }

    @Override
    public List<CaKhamBenh> getCaKhams() {
        return this.caKhamBenhRepository.getCaKhams();
    }

}
