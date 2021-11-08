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
 * @author DAO
 */
@Entity
@Table(name = "nhacungcap")
public class NhaCungCap {

    /**
     * @return the idNCC
     */
    public int getIdNCC() {
        return idNCC;
    }

    /**
     * @param idNCC the idNCC to set
     */
    public void setIdNCC(int idNCC) {
        this.idNCC = idNCC;
    }

    /**
     * @return the tenNCC
     */
    public String getTenNCC() {
        return tenNCC;
    }

    /**
     * @param tenNCC the tenNCC to set
     */
    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNCC;
    private String tenNCC;
}
