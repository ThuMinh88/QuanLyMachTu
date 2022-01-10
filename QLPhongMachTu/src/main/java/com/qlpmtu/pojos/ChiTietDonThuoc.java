/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ACER
 */
@Entity
@Table(name="chitietdonthuoc")
public class ChiTietDonThuoc implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="idDT",referencedColumnName = "idDT")
    private DonThuoc donthuoc;
    
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="idthuoc", referencedColumnName = "idThuoc")
    private Thuoc thuoc;
    
    private int soluong;
    private String lieuluong;
    private Long dongia;
    private Long thanhtien;

    /**
     * @return the donthuoc
     */
    public DonThuoc getDonthuoc() {
        return donthuoc;
    }

    /**
     * @param donthuoc the donthuoc to set
     */
    public void setDonthuoc(DonThuoc donthuoc) {
        this.donthuoc = donthuoc;
    }

    /**
     * @return the thuoc
     */
    public Thuoc getThuoc() {
        return thuoc;
    }

    /**
     * @param thuoc the thuoc to set
     */
    public void setThuoc(Thuoc thuoc) {
        this.thuoc = thuoc;
    }

    /**
     * @return the soluong
     */
    public int getSoluong() {
        return soluong;
    }

    /**
     * @param soluong the soluong to set
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    /**
     * @return the lieuluong
     */
    public String getLieuluong() {
        return lieuluong;
    }

    /**
     * @param lieuluong the lieuluong to set
     */
    public void setLieuluong(String lieuluong) {
        this.lieuluong = lieuluong;
    }

    /**
     * @return the dongia
     */
    public Long getDongia() {
        return dongia;
    }

    /**
     * @param dongia the dongia to set
     */
    public void setDongia(Long dongia) {
        this.dongia = dongia;
    }

    /**
     * @return the thanhtien
     */
    public Long getThanhtien() {
        return thanhtien;
    }

    /**
     * @param thanhtien the thanhtien to set
     */
    public void setThanhtien(Long thanhtien) {
        this.thanhtien = thanhtien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
