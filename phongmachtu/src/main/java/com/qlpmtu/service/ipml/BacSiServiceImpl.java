/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.BacSi;
import com.qlpmtu.repository.BacSiRepository;
import com.qlpmtu.service.BacSiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class BacSiServiceImpl implements BacSiService{
    @Autowired
    private BacSiRepository bacSiRepository;

    @Override
    public List<BacSi> getBacSis() {
        return this.bacSiRepository.getBacSis();
    }

    @Override
    public BacSi getBSById(int bsID) {
        return this.bacSiRepository.getBSById(bsID);
    }

    @Override
    public boolean addBs(BacSi bs) {
        return this.bacSiRepository.addBs(bs);
    }

    @Override
    public boolean deleteBs(int bsID) {
        return this.bacSiRepository.deleteBs(bsID);
    }
    
}
