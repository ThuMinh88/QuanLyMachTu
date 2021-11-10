/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.formatter;

import com.qlpmtu.pojos.DanhMucThuoc;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;


/**
 *
 * @author DAO
 */
public class DanhMucThuocFormatter implements Formatter<DanhMucThuoc>{

    @Override
    public String print(DanhMucThuoc t, Locale locale) {
        return String.valueOf(t.getIdDM());
    }

    @Override
    public DanhMucThuoc parse(String idDM, Locale locale) throws ParseException {
        DanhMucThuoc dm = new DanhMucThuoc();
        dm.setIdDM(Integer.parseInt(idDM));
        return dm;
    }
    
}
