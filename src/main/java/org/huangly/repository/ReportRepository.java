package org.huangly.repository;

import org.huangly.domain.ReportData;
import org.springframework.data.repository.CrudRepository;

public interface ReportRepository extends CrudRepository<ReportData,String> {
}
