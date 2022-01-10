/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.repository.ReportRepository;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import com.qlpmtu.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author DAO
 */
@Service
public class ReportServiceImpl implements ReportService{

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public List<Object[]> patientStats( Date date, Date date1) {
        return this.reportRepository.patientStats( date, date1);
    }

    @Override
    public List<Object[]> billStats(Date date, Date date1) {
      return this.reportRepository.billStats(date, date1);
    }
    
  
}
