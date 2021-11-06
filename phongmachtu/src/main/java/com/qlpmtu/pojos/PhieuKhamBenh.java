/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.util.Date;
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
@Table(name="phieukhambenh")
public class PhieuKhamBenh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPhieuKB;
    private int idBS;
    private int idBN;
    private Date ngaykham;
    private Boolean xacnhan;

    /**
     * @return the idPhieuKB
     */
    public int getIdPhieuKB() {
        return idPhieuKB;
    }

    /**
     * @param idPhieuKB the idPhieuKB to set
     */
    public void setIdPhieuKB(int idPhieuKB) {
        this.idPhieuKB = idPhieuKB;
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
     * @return the ngaykham
     */
    public Date getNgaykham() {
        return ngaykham;
    }

    /**
     * @param ngaykham the ngaykham to set
     */
    public void setNgaykham(Date ngaykham) {
        this.ngaykham = ngaykham;
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
}
