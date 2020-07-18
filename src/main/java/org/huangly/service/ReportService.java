package org.huangly.service;

import org.huangly.common.Result;
import org.huangly.domain.Org;
import org.huangly.domain.ReportData;
import org.huangly.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;
    public ReportData insert(ReportData reportData) {
         return  reportRepository.save(reportData);
    }
}
