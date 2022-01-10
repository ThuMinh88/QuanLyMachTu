/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service;

import com.qlpmtu.pojos.Thuoc;
import java.util.List;

/**
 *
 * @author DAO
 */
public interface ThuocService {
    List<Thuoc> getThuocs(String kw);
    boolean addOrUpdate(Thuoc thuoc);
    boolean deleteThuoc( int thuocID);
    Thuoc getThuocById (int thuocID);
}
