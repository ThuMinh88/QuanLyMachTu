/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ACER
 */

@Entity
@Table(name = "cakhambenh")
public class CaKhamBenh implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "TenCa")
    private String tenCa;
    @Column(name = "MoTa")
    private String moTa;
    @OneToMany(mappedBy = "caKhamBenh", fetch = FetchType.LAZY)
    private Set<ChiTietCaKhamBenh> dsChiTietCaKhamBenh;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tenCa
     */
    public String getTenCa() {
        return tenCa;
    }

    /**
     * @param tenCa the tenCa to set
     */
    public void setTenCa(String tenCa) {
        this.tenCa = tenCa;
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

    /**
     * @return the dsChiTietCaKhamBenh
     */
    public Set<ChiTietCaKhamBenh> getDsChiTietCaKhamBenh() {
        return dsChiTietCaKhamBenh;
    }

    /**
     * @param dsChiTietCaKhamBenh the dsChiTietCaKhamBenh to set
     */
    public void setDsChiTietCaKhamBenh(Set<ChiTietCaKhamBenh> dsChiTietCaKhamBenh) {
        this.dsChiTietCaKhamBenh = dsChiTietCaKhamBenh;
    }

   
}
