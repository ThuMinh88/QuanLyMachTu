/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository;

import com.qlpmtu.pojos.BenhNhan;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface BenhNhanRepository {
    BenhNhan getBenhNhanById(int i);
    List<BenhNhan> getBenhNhans();
    boolean addName(BenhNhan bn);
    long countBenhNhan();
}
