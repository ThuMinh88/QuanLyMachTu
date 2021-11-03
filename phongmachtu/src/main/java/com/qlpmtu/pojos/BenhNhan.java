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
@Table(name="benhnhan")
public class BenhNhan{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBN")
    private int idBenhNhan;
    
    @Column(name = "hoBN")
    private String hoBenhNhan;
    
    @Column(name = "tenBN")
    private String tenBenhNhan;
    
    @Column(name = "gioitinh")
    private String gioiTinh;
    
    @Column(name = "sodienthoai")
    private String sdt;
    
    @Column(name = "namsinh")
    private Date namSinh;
    
    @Column(name = "email")
    private String email;
    
    private String diachi;
//    
//    @Column(name = "anhdaidien")
//    private String avt;
    
    @Column(name = "benhan")
    private String benhAn;

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
    public String getHoBenhNhan() {
        return hoBenhNhan;
    }

    /**
     * @param hoBenhNhan the hoBenhNhan to set
     */
    public void setHoBenhNhan(String hoBenhNhan) {
        this.hoBenhNhan = hoBenhNhan;
    }

    /**
     * @return the tenBenhNhan
     */
    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    /**
     * @param tenBenhNhan the tenBenhNhan to set
     */
    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    /**
     * @return the namSinh
     */
    public Date getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the avt
//     */
//    public String getAvt() {
//        return avt;
//    }

    /**
     * @param avt the avt to set
//     */
//    public void setAvt(String avt) {
//        this.avt = avt;
//    }

    /**
     * @return the benhAn
     */
    public String getBenhAn() {
        return benhAn;
    }

    /**
     * @param benhAn the benhAn to set
     */
    public void setBenhAn(String benhAn) {
        this.benhAn = benhAn;
    }

    /**
     * @return the diachi
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * @param diachi the diachi to set
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

}
