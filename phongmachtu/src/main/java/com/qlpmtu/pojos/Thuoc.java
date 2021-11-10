/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;


/**
 *
 * @author DAO
 */
@Entity
@Table(name = "thuoc")
public class Thuoc implements Serializable{

    

   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idthuoc")
    private int idThuoc;
    
   @NotEmpty(message="{thuoc.empty.emptyErr}")
    @Column(name = "tenthuoc")
    private String tenThuoc;
   
   @NotNull(message="{thuoc.empty.emptyErr}")
    @Column(name = "soluong")
    private BigDecimal soLuong;
   
   
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Past
    @Column(name = "hansudung")
    private Date hanSuDung;
   
   //@NotEmpty(message="{thuoc.empty.emptyErr}")
    //@Min(value = 1000, message="{thuoc.giaban.minErr}")
    @NotNull(message="{thuoc.empty.emptyErr}")
    @Column(name = "giaban")
    private BigDecimal giaBan;
    
    @Column(name = "mota")
    private String moTa;
    
   
    @ManyToOne
    @JoinColumn(name = "idDMT")
    private DanhMucThuoc danhMucThuoc;
    
   
    @ManyToOne
    @JoinColumn(name = "idNCC")
    private NhaCungCap nhaCungCap;
    /**
     * @return the idThuoc
     */
    public int getIdThuoc() {
        return idThuoc;
    }

    /**
     * @param idThuoc the idThuoc to set
     */
    public void setIdThuoc(int idThuoc) {
        this.idThuoc = idThuoc;
    }

    /**
     * @return the tenThuoc
     */
    public String getTenThuoc() {
        return tenThuoc;
    }

    /**
     * @param tenThuoc the tenThuoc to set
     */
    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    /**
     * @return the soLuong
     */
    public BigDecimal getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(BigDecimal soLuong) {
        this.soLuong = soLuong;
    }

    
    /**
     * @return the giaBan
     */
    public BigDecimal getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
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
     * @return the danhMucThuoc
     */
    public DanhMucThuoc getDanhMucThuoc() {
        return danhMucThuoc;
    }

    /**
     * @param danhMucThuoc the danhMucThuoc to set
     */
    public void setDanhMucThuoc(DanhMucThuoc danhMucThuoc) {
        this.danhMucThuoc = danhMucThuoc;
    }

    /**
     * @return the nhaCungCap
     */
    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    /**
     * @param nhaCungCap the nhaCungCap to set
     */
    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
   /**
     * @return the hanSuDung
     */
    public Date getHanSuDung() {
        return hanSuDung;
    }

    /**
     * @param hanSuDung the hanSuDung to set
     */
    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }
    
}
