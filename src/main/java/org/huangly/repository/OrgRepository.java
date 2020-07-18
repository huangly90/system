package org.huangly.repository;

import org.huangly.domain.Org;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OrgRepository extends CrudRepository<Org,String> {
}
