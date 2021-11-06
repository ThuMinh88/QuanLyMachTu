/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository;

import com.qlpmtu.pojos.YTa;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface YTaRepository {
    List<YTa> getYTas(); 
    YTa getYTaById(int ytaID);
    boolean addYTa(YTa yt);
    boolean deleteYta(int ytaID);
}
