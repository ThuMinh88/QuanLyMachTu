/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

/**
 *
 * @author ACER
 */
@Entity
@Table (name = "hoadon")
public class HoaDon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHD;
    
    @Column(name="idnguoiTT")
    private int bn_id;
    
    @Column(name = "idnhanvienTT")
    private int yt_id;
    
    private String hinhthucTT;
    
    @NumberFormat(style=Style.CURRENCY)
    private BigDecimal tongTT;

    /**
     * @return the idHD
     */
    public int getIdHD() {
        return idHD;
    }

    /**
     * @param idHD the idHD to set
     */
    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    /**
     * @return the bn_id
     */
    public int getBn_id() {
        return bn_id;
    }

    /**
     * @param bn_id the bn_id to set
     */
    public void setBn_id(int bn_id) {
        this.bn_id = bn_id;
    }

    /**
     * @return the yt_id
     */
    public int getYt_id() {
        return yt_id;
    }

    /**
     * @param yt_id the yt_id to set
     */
    public void setYt_id(int yt_id) {
        this.yt_id = yt_id;
    }

    /**
     * @return the hinhthucTT
     */
    public String getHinhthucTT() {
        return hinhthucTT;
    }

    /**
     * @param hinhthucTT the hinhthucTT to set
     */
    public void setHinhthucTT(String hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }

    /**
     * @return the tongTT
     */
    public BigDecimal getTongTT() {
        return tongTT;
    }

    /**
     * @param tongTT the tongTT to set
     */
    public void setTongTT(BigDecimal tongTT) {
        this.tongTT = tongTT;
    }
}
