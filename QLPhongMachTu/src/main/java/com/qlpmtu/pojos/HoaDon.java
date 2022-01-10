/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "hoadon")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHD;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bn_id", referencedColumnName = "idBN")
    private BenhNhan bn_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "yta_id", referencedColumnName = "idYT")
    private YTa yta_id;

    private String hinhthucTT;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @NumberFormat(style = Style.CURRENCY)
    private BigDecimal tongTT;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "donthuoc_id", nullable = false)
    private DonThuoc donThuocID;

    public HoaDon() {
        createdDate = new Date();
    }

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
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    /**
     * @return the donThuocID
     */
    public DonThuoc getDonThuocID() {
        return donThuocID;
    }

    /**
     * @param donThuocID the donThuocID to set
     */
    public void setDonThuocID(DonThuoc donThuocID) {
        this.donThuocID = donThuocID;
    }

    /**
     * @return the yta_id
     */
    public YTa getYta_id() {
        return yta_id;
    }

    /**
     * @param yta_id the yta_id to set
     */
    public void setYta_id(YTa yta_id) {
        this.yta_id = yta_id;
    }

}
