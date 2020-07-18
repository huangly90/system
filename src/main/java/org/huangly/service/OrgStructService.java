package org.huangly.service;

import org.huangly.domain.OrgStruct;
import org.huangly.exception.DataNoFundException;
import org.huangly.repository.OrgStructRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrgStructService {

    @Autowired
    OrgStructRepository orgStructRepository;

    public OrgStruct insert(OrgStruct orgstruct) {
       return orgStructRepository.save(orgstruct);
    }
    public OrgStruct update(OrgStruct orgstruct){
        return orgStructRepository.save(orgstruct);
    }
    public void delete(String id){
        orgStructRepository.deleteById(id);
    }
    public List<OrgStruct> findAll(){
        List<OrgStruct> list=new ArrayList();
        orgStructRepository.findAll().iterator().forEachRemaining(
                orgstruct->list.add(orgstruct)
        );
        return list;
    }
    public OrgStruct findById(String id) {
        return orgStructRepository.findById(id).orElseThrow(()-> new DataNoFundException());
    }

}
