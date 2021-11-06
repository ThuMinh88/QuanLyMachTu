/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.YTa;
import com.qlpmtu.repository.YTaRepository;
import com.qlpmtu.service.YTaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class YTaServiceImpl implements YTaService{
    
    @Autowired
    private YTaRepository yTaRepository;

    @Override
    public List<YTa> getYTas() {
        return this.yTaRepository.getYTas();
    }

    @Override
    public YTa getYTaById(int ytaId) {
        return this.yTaRepository.getYTaById(ytaId);
    }

    @Override
    public boolean addYTa(YTa yt) {
        return this.yTaRepository.addYTa(yt);
    }

    @Override
    public boolean deleteYta(int ytaID) {
        return this.yTaRepository.deleteYta(ytaID);
    }
    
}
