/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service;

import com.qlpmtu.pojos.BenhNhan;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author ACER
 */
public interface BenhNhanService {
    BenhNhan getBenhNhanById(int i);
    List<BenhNhan> getBenhNhans();
    boolean addName(BenhNhan bn);
    Long countBenhNhan();
}
