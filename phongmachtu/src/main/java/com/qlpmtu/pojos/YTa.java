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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "yta")
public class YTa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idYT;

    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @Column(name = "ho")
    private String hoYTa;
    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @Size(min = 1, max = 10, message = "{name.size.sizeErr}")
    @Column(name = "ten")
    private String tenYta;

    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @Column(name = "gioitinh")
    private String gioiTinh;
    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @Column(name = "sodienthoai")
    private String sdt;
//    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Past
    @Column(name = "namsinh")
    private Date namSinh;

    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @Column(name = "email")
    private String email;
    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @Column(name = "diachi")
    private String diaChi;
    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @Column(name = "bangcap")
    private String bangCap;
    @NotEmpty(message = "{qlpm.empty.emptyErr}")
    @Column(name = "chucvu")
    private String chucVu;

    @Column(name = "kinhnghiem")
    private String kinhNghiem;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "idTK")
    private User userID;

    
    /**
     * @return the idYT
     */
    public int getIdYT() {
        return idYT;
    }

    /**
     * @param idYT the idYT to set
     */
    public void setIdYT(int idYT) {
        this.idYT = idYT;
    }

    /**
     * @return the hoYTa
     */
    public String getHoYTa() {
        return hoYTa;
    }

    /**
     * @param hoYTa the hoYTa to set
     */
    public void setHoYTa(String hoYTa) {
        this.hoYTa = hoYTa;
    }

    /**
     * @return the tenYta
     */
    public String getTenYta() {
        return tenYta;
    }

    /**
     * @param tenYta the tenYta to set
     */
    public void setTenYta(String tenYta) {
        this.tenYta = tenYta;
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
//
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
