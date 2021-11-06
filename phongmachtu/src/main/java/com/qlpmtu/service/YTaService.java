/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service;

import com.qlpmtu.pojos.YTa;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface YTaService {
    List<YTa> getYTas();
    YTa getYTaById(int ytaId);
    boolean addYTa(YTa yt);
    boolean deleteYta(int ytaID);
}
