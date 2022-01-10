/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.formatter;

import com.qlpmtu.pojos.Thuoc;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author ACER
 */
public class ThuocFormatter implements Formatter<Thuoc>{

    @Override
    public String print(Thuoc t, Locale locale) {
        return String.valueOf(t.getIdThuoc());
    }

    @Override
    public Thuoc parse(String idT, Locale locale) throws ParseException {
        Thuoc t = new Thuoc();
        t.setIdThuoc(Integer.parseInt(idT));
        return t;
    }
    
}
