/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "chitietcakhambenh")
public class ChiTietCaKhamBenh implements Serializable {
    @Id
    @Column(name = "ca_id")
    private int id;
    @Id
    @Column(name = "bs_id")
    private int bs_id;
    
    @Column(name = "NgayKhamBenh")  
    private Date ngayKhamBenh;
    @ManyToOne
    @MapsId
    @JoinColumn(name = "ca_id")
    private CaKhamBenh caKhamBenh;
    @ManyToOne
    @MapsId
    @JoinColumn(name = "bs_id")
    private BacSi bacSi;

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
     * @return the bs_id
     */
    public int getBs_id() {
        return bs_id;
    }

    /**
     * @param bs_id the bs_id to set
     */
    public void setBs_id(int bs_id) {
        this.bs_id = bs_id;
    }

    /**
     * @return the ngayKhamBenh
     */
    public Date getNgayKhamBenh() {
        return ngayKhamBenh;
    }

    /**
     * @param ngayKhamBenh the ngayKhamBenh to set
     */
    public void setNgayKhamBenh(Date ngayKhamBenh) {
        this.ngayKhamBenh = ngayKhamBenh;
    }

    /**
     * @return the caKhamBenh
     */
    public CaKhamBenh getCaKhamBenh() {
        return caKhamBenh;
    }

    /**
     * @param caKhamBenh the caKhamBenh to set
     */
    public void setCaKhamBenh(CaKhamBenh caKhamBenh) {
        this.caKhamBenh = caKhamBenh;
    }

    /**
     * @return the bacSi
     */
    public BacSi getBacSi() {
        return bacSi;
    }

    /**
     * @param bacSi the bacSi to set
     */
    public void setBacSi(BacSi bacSi) {
        this.bacSi = bacSi;
    }

}