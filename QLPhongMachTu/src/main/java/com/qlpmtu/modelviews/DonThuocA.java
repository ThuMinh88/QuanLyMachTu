/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.modelviews;

import com.qlpmtu.pojos.BacSi;
import com.qlpmtu.pojos.BenhNhan;

/**
 *
 * @author ACER
 */
public class DonThuocA {
    private BenhNhan benhnhan;
    private BacSi bacsi;
    private String trieuchung;

    /**
     * @return the benhnhan
     */
    public BenhNhan getBenhnhan() {
        return benhnhan;
    }

    /**
     * @param benhnhan the benhnhan to set
     */
    public void setBenhnhan(BenhNhan benhnhan) {
        this.benhnhan = benhnhan;
    }

    /**
     * @return the bacsi
     */
    public BacSi getBacsi() {
        return bacsi;
    }

    /**
     * @param bacsi the bacsi to set
     */
    public void setBacsi(BacSi bacsi) {
        this.bacsi = bacsi;
    }

    /**
     * @return the trieuchung
     */
    public String getTrieuchung() {
        return trieuchung;
    }

    /**
     * @param trieuchung the trieuchung to set
     */
    public void setTrieuchung(String trieuchung) {
        this.trieuchung = trieuchung;
    }
}
