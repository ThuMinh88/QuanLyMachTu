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
import org.springframework.format.annotation.DateTimeFormat;


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
    private int idBN;
    
    @Column(name = "hoBN")
    private String firstname;
    
    @Column(name = "tenBN")
    private String lastname;
    
    @Column(name = "gioitinh")
    private String gioiTinh;
    
    @Column(name = "sodienthoai")
    private String sdt;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "namsinh")
    private Date namSinh;
    
    @Column(name = "email")
    private String email;
    
    private String diachi;
    @Column(name = "benhan")
    private String trieuChung;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "idTK")
    private User userID;
    
    @OneToMany(mappedBy = "bn_id", fetch = FetchType.EAGER)
    private Collection<PhieuKhamBenh> phieuKhamBenhCollection;

    public BenhNhan(){
        
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
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    /**
     * @return the userID
     */
    public User getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(User userID) {
        this.userID = userID;
    }

    /**
     * @return the phieuKhamBenhCollection
     */
    public Collection<PhieuKhamBenh> getPhieuKhamBenhCollection() {
        return phieuKhamBenhCollection;
    }

    /**
     * @param phieuKhamBenhCollection the phieuKhamBenhCollection to set
     */
    public void setPhieuKhamBenhCollection(Collection<PhieuKhamBenh> phieuKhamBenhCollection) {
        this.phieuKhamBenhCollection = phieuKhamBenhCollection;
    }

    /**
     * @return the trieuChung
     */
    public String getTrieuChung() {
        return trieuChung;
    }

    /**
     * @param trieuChung the trieuChung to set
     */
    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    
}
