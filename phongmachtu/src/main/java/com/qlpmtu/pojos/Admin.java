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
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTK;
    private String ho;
    private String ten;
    private String gioitinh;
    @Column(name="sodienthoai")
    private String sdt;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date namsinh;
    private String email;
    private String diachi;
    private String chucvu;
    private String bangcap;
    private String kinhnghiem;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userID;

    /**
     * @return the id
     */
    public int getId() {
        return idTK;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.idTK = id;
    }

    /**
     * @return the ho
     */
    public String getHo() {
        return ho;
    }

    /**
     * @param ho the ho to set
     */
    public void setHo(String ho) {
        this.ho = ho;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the gioitinh
     */
    public String getGioitinh() {
        return gioitinh;
    }

    /**
     * @param gioitinh the gioitinh to set
     */
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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
     * @return the namsinh
     */
    public Date getNamsinh() {
        return namsinh;
    }

    /**
     * @param namsinh the namsinh to set
     */
    public void setNamsinh(Date namsinh) {
        this.namsinh = namsinh;
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
     * @return the chucvu
     */
    public String getChucvu() {
        return chucvu;
    }

    /**
     * @param chucvu the chucvu to set
     */
    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    /**
     * @return the bangcap
     */
    public String getBangcap() {
        return bangcap;
    }

    /**
     * @param bangcap the bangcap to set
     */
    public void setBangcap(String bangcap) {
        this.bangcap = bangcap;
    }

    /**
     * @return the kinhnghiem
     */
    public String getKinhnghiem() {
        return kinhnghiem;
    }

    /**
     * @param kinhnghiem the kinhnghiem to set
     */
    public void setKinhnghiem(String kinhnghiem) {
        this.kinhnghiem = kinhnghiem;
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

}
