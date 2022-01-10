/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ACER
 */
@Entity
@Table (name="loaitaikhoan")
public class LoaiTaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLoaiTK;
    
    @Column(name="tenloaiTK")
    private int tenLoaiTK;

    /**
     * @return the idLoaiTK
     */
    public int getIdLoaiTK() {
        return idLoaiTK;
    }

    /**
     * @param idLoaiTK the idLoaiTK to set
     */
    public void setIdLoaiTK(int idLoaiTK) {
        this.idLoaiTK = idLoaiTK;
    }

    /**
     * @return the tenLoaiTK
     */
    public int getTenLoaiTK() {
        return tenLoaiTK;
    }

    /**
     * @param tenLoaiTK the tenLoaiTK to set
     */
    public void setTenLoaiTK(int tenLoaiTK) {
        this.tenLoaiTK = tenLoaiTK;
    }

}
