/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ACER
 */
@Entity
@Table (name="taikhoan")
public class User implements Serializable{
    private static String ADMIN = "ROLE_ADMIN";
    private static String DOCTOR = "ROLE_DOCTOR";
    private static String YTA = "ROLE_YTA";
    private static String USER = "ROLE_USER";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTK;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String username;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "password")
    @JsonIgnore
    private String password;
    
    @Transient
    @JsonIgnore
    private String confirmPassword;
    
    private String avatar;
    @Column (name="user-role")
    private String userRole;
    
    @Transient
    private MultipartFile file;

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
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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
