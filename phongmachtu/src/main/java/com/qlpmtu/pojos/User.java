/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ACER
 */
@Entity
@Table (name="taikhoan")
public class User implements Serializable{
    private static String ADMIN = "2101";
    private static String DOCTOR = "2102";
    private static String YTA = "2103";
    private static String USER = "2104";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTK;
    private String username;
    private String password;
    private String avatar;
    @Column(name="idLoaiTK")
    private String userRole;
    
    @Transient
    private MultipartFile file;

    /**
     * @return the ADMIN
     */
    public static String getADMIN() {
        return ADMIN;
    }

    /**
     * @param aADMIN the ADMIN to set
     */
    public static void setADMIN(String aADMIN) {
        ADMIN = aADMIN;
    }

    /**
     * @return the DOCTOR
     */
    public static String getDOCTOR() {
        return DOCTOR;
    }

    /**
     * @param aDOCTOR the DOCTOR to set
     */
    public static void setDOCTOR(String aDOCTOR) {
        DOCTOR = aDOCTOR;
    }

    /**
     * @return the YTA
     */
    public static String getYTA() {
        return YTA;
    }

    /**
     * @param aYTA the YTA to set
     */
    public static void setYTA(String aYTA) {
        YTA = aYTA;
    }

    /**
     * @return the USER
     */
    public static String getUSER() {
        return USER;
    }

    /**
     * @param aUSER the USER to set
     */
    public static void setUSER(String aUSER) {
        USER = aUSER;
    }

    /**
     * @return the idTK
     */
    public int getIdTK() {
        return idTK;
    }

    /**
     * @param idTK the idTK to set
     */
    public void setIdTK(int idTK) {
        this.idTK = idTK;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar the avatar to set
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return the userRole
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * @param userRole the userRole to set
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * @return the file
     */
    public MultipartFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(MultipartFile file) {
        this.file = file;
    }

    
}
