/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository;

import com.qlpmtu.pojos.BacSi;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface BacSiRepository {
    List<BacSi> getBacSis();
    BacSi getBSById(int bsID);
    boolean addBs(BacSi bs);
    boolean deleteBs(int bsID);
}
