/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author ACER
 */
@Entity
@Table(name="thuoc")
public class BenhNhan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBN")
    private int idBenhNhan;
    
    @Column(name = "hoBN")
    private int hoBenhNhan;
    
    @Column(name = "tenBN")
    private int tenBenhNhan;
    
    @Column(name = "gioitinh")
    private int gioiTinh;
    
    @Column(name = "sodienthoai")
    private int sdt;
    
    @Column(name = "namsinh")
    private int namSinh;
    
    @Column(name = "email")
    private int email;
    
    @Column(name = "anhdaidien")
    private int avt;
    
    @Column(name = "benhan")
    private int benhAn;

    /**
     * @return the idBenhNhan
     */
    public int getIdBenhNhan() {
        return idBenhNhan;
    }

    /**
     * @param idBenhNhan the idBenhNhan to set
     */
    public void setIdBenhNhan(int idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    /**
     * @return the hoBenhNhan
     */
    public int getHoBenhNhan() {
        return hoBenhNhan;
    }

    /**
     * @param hoBenhNhan the hoBenhNhan to set
     */
    public void setHoBenhNhan(int hoBenhNhan) {
        this.hoBenhNhan = hoBenhNhan;
    }

    /**
     * @return the tenBenhNhan
     */
    public int getTenBenhNhan() {
        return tenBenhNhan;
    }

    /**
     * @param tenBenhNhan the tenBenhNhan to set
     */
    public void setTenBenhNhan(int tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    /**
     * @return the gioiTinh
     */
    public int getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the sdt
     */
    public int getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    /**
     * @return the namSinh
     */
    public int getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @return the email
     */
    public int getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(int email) {
        this.email = email;
    }

    /**
     * @return the avt
     */
    public int getAvt() {
        return avt;
    }

    /**
     * @param avt the avt to set
     */
    public void setAvt(int avt) {
        this.avt = avt;
    }

    /**
     * @return the benhAn
     */
    public int getBenhAn() {
        return benhAn;
    }

    /**
     * @param benhAn the benhAn to set
     */
    public void setBenhAn(int benhAn) {
        this.benhAn = benhAn;
    }
    
}
