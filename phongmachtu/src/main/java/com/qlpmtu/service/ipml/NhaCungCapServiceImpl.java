/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.NhaCungCap;
import com.qlpmtu.repository.NhaCungCapRepository;
import com.qlpmtu.service.NhaCungCapService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DAO
 */
@Service
public class NhaCungCapServiceImpl implements NhaCungCapService{
    @Autowired
    private NhaCungCapRepository nhaCungCapRepository; 

    @Override
    public List<NhaCungCap> getNhaCungCaps() {
        return this.nhaCungCapRepository.getNhaCungCaps();
    }
}
