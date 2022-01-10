/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service;

import com.qlpmtu.pojos.PhieuKhamBenh;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface PhieuKhamBenhService {
    List<PhieuKhamBenh> getPhieuKhamBenhs();
    List<PhieuKhamBenh> getPhieuChuaXNKhams();
    List<PhieuKhamBenh> getPhieuXNKhams();
    List<PhieuKhamBenh> getPhieuDaKhams();
    boolean addPhieu(PhieuKhamBenh phieu);
    long countPhieuChuaKham();
    boolean acceptPhieu(int phieuID);
    PhieuKhamBenh getPhieuKhamBenhById(int phieuID);
    List<PhieuKhamBenh> getPhieuChuaKhams();
    boolean deletePhieu(int id);
}
