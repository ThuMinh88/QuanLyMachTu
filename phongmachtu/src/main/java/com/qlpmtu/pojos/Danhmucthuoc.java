/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DAO
 */
@Entity
@Table(name = "danhmucthuoc")
public class DanhMucThuoc implements Serializable{

   
    /**
     * @return the idDM
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDM;
    private String tenDM;
    private String moTa;
    
    public int getIdDM() {
        return idDM;
    }

    /**
     * @param idDM the idDM to set
     */
    public void setIdDM(int idDM) {
        this.idDM = idDM;
    }

    /**
     * @return the tenDM
     */
    public String getTenDM() {
        return tenDM;
    }

    /**
     * @param tenDM the tenDM to set
     */
    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }
    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
   
}
