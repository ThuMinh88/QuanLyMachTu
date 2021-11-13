/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.formatter;

import com.qlpmtu.pojos.BenhNhan;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author ACER
 */
public class BenhNhanFormatter implements Formatter<BenhNhan>{

    @Override
    public String print(BenhNhan t, Locale locale) {
        return String.valueOf(t.getIdBN());
    }

    @Override
    public BenhNhan parse(String idBN, Locale locale) throws ParseException {
       BenhNhan bn = new BenhNhan();
       bn.setIdBN(Integer.parseInt(idBN));
       return bn;
    }
    
}
