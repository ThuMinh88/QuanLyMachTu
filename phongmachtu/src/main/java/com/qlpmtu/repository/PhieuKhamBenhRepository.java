/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository;

import com.qlpmtu.pojos.PhieuKhamBenh;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface PhieuKhamBenhRepository {

    List<PhieuKhamBenh> getPhieuKhamBenhs();

    boolean addBNID(PhieuKhamBenh id);

    long countPhieuChuaKham();
    
}
