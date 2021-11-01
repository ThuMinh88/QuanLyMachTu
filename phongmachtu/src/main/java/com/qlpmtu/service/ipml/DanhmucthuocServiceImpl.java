/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.DanhMucThuoc;
import com.qlpmtu.repository.DanhMucThuocRepository;
import com.qlpmtu.service.DanhMucThuocService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DAO
 */
@Service
public class DanhMucThuocServiceImpl implements DanhMucThuocService{
    @Autowired
    private DanhMucThuocRepository danhMucThuocRepository;

    @Override
    public List<DanhMucThuoc> getDanhMucThuocs() {
        return this.danhMucThuocRepository.getDanhMucThuocs();
    }
   

    
}
