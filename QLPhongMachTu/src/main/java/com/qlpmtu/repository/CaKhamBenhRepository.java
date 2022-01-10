/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository;

import com.qlpmtu.pojos.CaKhamBenh;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface CaKhamBenhRepository {
    CaKhamBenh getCaById(int id);
    List<CaKhamBenh> getCaKhams();
}
