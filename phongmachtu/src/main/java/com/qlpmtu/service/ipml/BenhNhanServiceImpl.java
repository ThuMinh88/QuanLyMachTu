/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.repository.BenhNhanRepository;
import com.qlpmtu.repository.UserReponsitory;
import com.qlpmtu.service.BenhNhanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class BenhNhanServiceImpl implements BenhNhanService{
    @Autowired
    private BenhNhanRepository benhNhanRepository;
    

    @Override
    public List<BenhNhan> getBenhNhans() {
        return this.benhNhanRepository.getBenhNhans();
    }

    @Override
    public BenhNhan getBenhNhanById(int i) {
        return this.benhNhanRepository.getBenhNhanById(i);
    }

    @Override
    public boolean addName(BenhNhan bn) {
        return this.benhNhanRepository.addName(bn);
    }

    @Override
    public Long countBenhNhan() {
        return this.benhNhanRepository.countBenhNhan();
    }
    
}
