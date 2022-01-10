/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service;

import java.util.Date;
import java.util.List;

/**
 *
 * @author DAO
 */
public interface ReportService {
    List<Object []> patientStats( Date fromDate, Date toDate);
     List<Object []> billStats( Date fromDate, Date toDate);
}
