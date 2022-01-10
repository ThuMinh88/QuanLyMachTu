/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository;

import com.qlpmtu.pojos.ChiTietCaKhamBenh;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface ChiTietCaKhamBenhRepository{
    boolean addCTCaKham(ChiTietCaKhamBenh ct);
    List<ChiTietCaKhamBenh> getChiTietCas();
    ChiTietCaKhamBenh getCTCaById(int id);
}
