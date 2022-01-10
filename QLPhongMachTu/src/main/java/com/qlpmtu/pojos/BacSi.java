/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table (name="bacsi")
public class BacSi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBS;
    
    @Column(name = "ho")
    private String hoBS;
    
    @Column(name = "ten")
    private String tenBS;
    
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
    
    @Column(name = "diachi")
    private String diaChi;
    
    @Column(name = "bangcap")
    private String bangCap;
    
    @Column(name = "chucvu")
    private String chucVu;
    
    @Column(name="chuyenkhoa")
    private String chuyenKhoa;
    
    @Column(name = "kinhnghiem")
    private String kinhNghiem;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User userID;
    
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
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    /**
     * @return the bangCap
     */
    public String getBangCap() {
        return bangCap;
    }

    /**
     * @param bangCap the bangCap to set
     */
    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    /**
     * @return the chucVu
     */
    public String getChucVu() {
        return chucVu;
    }

    /**
     * @param chucVu the chucVu to set
     */
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    /**
     * @return the chuyenKhoa
     */
    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    /**
     * @param chuyenKhoa the chuyenKhoa to set
     */
    public void setChuyenKhoa(String chuyenKhoa) {
        this.chuyenKhoa = chuyenKhoa;
    }

    /**
     * @return the kinhNghiem
     */
    public String getKinhNghiem() {
        return kinhNghiem;
    }

    /**
     * @param kinhNghiem the kinhNghiem to set
     */
    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
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
     * @return the hoBS
     */
    public String getHoBS() {
        return hoBS;
    }

    /**
     * @param hoBS the hoBS to set
     */
    public void setHoBS(String hoBS) {
        this.hoBS = hoBS;
    }

    /**
     * @return the tenBS
     */
    public String getTenBS() {
        return tenBS;
    }

    /**
     * @param tenBS the tenBS to set
     */
    public void setTenBS(String tenBS) {
        this.tenBS = tenBS;
    }

//    /**
//     * @return the userId
//     */
//    public User getUserId() {
//        return userId;
//    }
//
//    /**
//     * @param userId the userId to set
//     */
//    public void setUserId(User userId) {
//        this.userId = userId;
//    }

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
}
