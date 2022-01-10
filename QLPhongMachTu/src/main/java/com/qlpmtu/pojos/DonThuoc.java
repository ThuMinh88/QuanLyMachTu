/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "donthuoc")
public class DonThuoc{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDT;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idBS", referencedColumnName = "idBS")
    private BacSi bsi_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idBN", referencedColumnName = "idBN")
    private BenhNhan bn_id;
    
    private String chuandoan;
    private String trieuchung;
    private Date ngayketoa;

    private String ghichu;
    @OneToMany(mappedBy = "donthuoc", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Set<ChiTietDonThuoc> dsChiTietDonThuoc;

    public DonThuoc(){
        ngayketoa = new Date();
    }
    /**
     * @return the idDT
     */
    public int getIdDT() {
        return idDT;
    }

    /**
     * @param idDT the idDT to set
     */
    public void setIdDT(int idDT) {
        this.idDT = idDT;
    }

    /**
     * @return the bsi_id
     */
    public BacSi getBsi_id() {
        return bsi_id;
    }

    /**
     * @param bsi_id the bsi_id to set
     */
    public void setBsi_id(BacSi bsi_id) {
        this.bsi_id = bsi_id;
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
     * @return the ghichu
     */
    public String getGhichu() {
        return ghichu;
    }

    /**
     * @param ghichu the ghichu to set
     */
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    /**
     * @return the dsChiTietDonThuoc
     */
    public Set<ChiTietDonThuoc> getDsChiTietDonThuoc() {
        return dsChiTietDonThuoc;
    }

    /**
     * @param dsChiTietDonThuoc the dsChiTietDonThuoc to set
     */
    public void setDsChiTietDonThuoc(Set<ChiTietDonThuoc> dsChiTietDonThuoc) {
        this.dsChiTietDonThuoc = dsChiTietDonThuoc;
    }

    /**
     * @return the chuandoan
     */
    public String getChuandoan() {
        return chuandoan;
    }

    /**
     * @param chuandoan the chuandoan to set
     */
    public void setChuandoan(String chuandoan) {
        this.chuandoan = chuandoan;
    }

    /**
     * @return the trieuchung
     */
    public String getTrieuchung() {
        return trieuchung;
    }

    /**
     * @param trieuchung the trieuchung to set
     */
    public void setTrieuchung(String trieuchung) {
        this.trieuchung = trieuchung;
    }

    /**
     * @return the ngayketoa
     */
    
    public Date getNgayketoa() {
        return ngayketoa;
    }

    /**
     * @param ngayketoa the ngayketoa to set
     */
    public void setNgayketoa(Date ngayketoa) {
        this.ngayketoa = ngayketoa;
    }

    public void setId(UUID randomUUID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
