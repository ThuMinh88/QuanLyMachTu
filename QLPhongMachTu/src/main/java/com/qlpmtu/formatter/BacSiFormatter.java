/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.formatter;

import com.qlpmtu.pojos.BacSi;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author ACER
 */
public class BacSiFormatter implements Formatter<BacSi>{

    @Override
    public String print(BacSi t, Locale locale) {
        return String.valueOf(t.getIdBS());
    }

    @Override
    public BacSi parse(String idBS, Locale locale) throws ParseException {
        BacSi bs = new BacSi();
        bs.setIdBS(Integer.parseInt(idBS));
        return bs;
    }
    
}
