/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.formatter;

import com.qlpmtu.pojos.NhaCungCap;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author DAO
 */
public class NhaCungCapFormatter implements Formatter<NhaCungCap>{

    @Override
    public String print(NhaCungCap t, Locale locale) {
        return String.valueOf(t.getIdNCC());
    }

    @Override
    public NhaCungCap parse(String idNCC, Locale locale) throws ParseException {
       NhaCungCap ncc = new NhaCungCap();
       ncc.setIdNCC(Integer.parseInt(idNCC));
       return ncc;
    }
    
}
