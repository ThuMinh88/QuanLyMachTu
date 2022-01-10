/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "phieukhambenh")
public class PhieuKhamBenh implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idphieuKB;
//    @Column(name="idBN")
    @ManyToOne
    @JoinColumn(name = "bn_id", referencedColumnName = "idBN")
    private BenhNhan bn_id;

    private Date created_date;
    private Boolean xacnhan;
    private Boolean khambenh;

    /**
     * @return the idphieuKB
     */
    public int getIdphieuKB() {
        return idphieuKB;
    }

    /**
     * @param idphieuKB the idphieuKB to set
     */
    public void setIdphieuKB(int idphieuKB) {
        this.idphieuKB = idphieuKB;
    }

    /**
     * @return the bn_id
     */
    public BenhNhan getBn_id() {
        return bn_id;
    }

    /**
     * @param bn_id the bn_id to set
     */
    public void setBn_id(BenhNhan bn_id) {
        this.bn_id = bn_id;
    }

    /**
     * @return the xacnhan
     */
    public Boolean getXacnhan() {
        return xacnhan;
    }

    /**
     * @param xacnhan the xacnhan to set
     */
    public void setXacnhan(Boolean xacnhan) {
        this.xacnhan = xacnhan;
    }

    /**
     * @return the created_date
     */
    public Date getCreated_date() {
        return created_date;
    }

    /**
     * @param created_date the created_date to set
     */
    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    /**
     * @return the khambenh
     */
    public Boolean getKhambenh() {
        return khambenh;
    }

    /**
     * @param khambenh the khambenh to set
     */
    public void setKhambenh(Boolean khambenh) {
        this.khambenh = khambenh;
    }

}
