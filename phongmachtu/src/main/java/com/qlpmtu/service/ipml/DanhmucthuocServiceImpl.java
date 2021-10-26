/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.Danhmucthuoc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qlpmtu.service.DanhmucthuocService;
import com.qlpmtu.repository.DanhmucthuocRepository;

/**
 *
 * @author DAO
 */@Service
public class DanhmucthuocServiceImpl implements DanhmucthuocService{
    @Autowired
    private DanhmucthuocRepository danhmucthuocRepository;
    
    @Override
    public List<Danhmucthuoc> getDanhmucthuoc() {
        return this.danhmucthuocRepository.getDanhmucthuoc();
    }
    
}
