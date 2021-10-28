/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DAO
 */
@Entity
@Table(name = "nhacungcap")
public class Nhacungcap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNCC;
    private String tenNCC;
}
