/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.pojos.Thuoc;
import com.qlpmtu.repository.ThuocRepository;
import com.qlpmtu.service.ThuocService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DAO
 */
@Service
public class ThuocServiceImpl implements ThuocService {

    @Autowired
    private ThuocRepository thuocRepository;

    @Override
    public List<Thuoc> getThuocs(String kw) {
        return this.thuocRepository.getThuocs(kw);
    }

    @Override
    public boolean addOrUpdate(Thuoc thuoc) {
        try {
            return this.thuocRepository.addOrUpdate(thuoc);
        } catch (Exception ex) {
            System.err.println("==ADD THUOC ERR" + ex.getMessage());
        }
        return false;
    }

    @Override
    public Thuoc getThuocById(int thuocID) {
        return this.thuocRepository.getThuocById(thuocID);
    }

    @Override
    public boolean deleteThuoc(int thuocID) {
        return this.thuocRepository.deleteThuoc(thuocID);
    }

}
