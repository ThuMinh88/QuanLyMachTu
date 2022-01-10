/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.formatter;

import com.qlpmtu.pojos.DonThuoc;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author ACER
 */
public class DonThuocFormatter implements Formatter<DonThuoc>{

    @Override
    public String print(DonThuoc t, Locale locale) {
       return String.valueOf(t.getIdDT());
    }

    @Override
    public DonThuoc parse(String idDT, Locale locale) throws ParseException {
        DonThuoc d = new DonThuoc();
        d.setIdDT((Integer.parseInt(idDT)));
        return d;
    }
    
    
}
