/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.BenhNhan;
import com.qlpmtu.repository.BenhNhanRepository;
import com.qlpmtu.service.BenhNhanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<BenhNhan> getBenhNhan() {
        return this.benhNhanRepository.getBenhNhan();
    }
    
}
