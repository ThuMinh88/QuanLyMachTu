/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "donthuoc")
public class DonThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDT;
    private int idBS;
    private int idBN;
    private String mota;

    /**
     * @return the idDT
     */
    public int getIdDT() {
        return idDT;
    }

    /**
     * @param idDT the idDT to set
     */
    public void setIdDT(int idDT) {
        this.idDT = idDT;
    }

    /**
     * @return the idBS
     */
    public int getIdBS() {
        return idBS;
    }

    /**
     * @param idBS the idBS to set
     */
    public void setIdBS(int idBS) {
        this.idBS = idBS;
    }

    /**
     * @return the idBN
     */
    public int getIdBN() {
        return idBN;
    }

    /**
     * @param idBN the idBN to set
     */
    public void setIdBN(int idBN) {
        this.idBN = idBN;
    }

    /**
     * @return the mota
     */
    public String getMota() {
        return mota;
    }

    /**
     * @param mota the mota to set
     */
    public void setMota(String mota) {
        this.mota = mota;
    }
    
}
