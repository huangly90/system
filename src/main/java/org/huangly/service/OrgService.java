package org.huangly.service;

import org.huangly.domain.Org;
import org.huangly.exception.DataNoFundException;
import org.huangly.repository.OrgRepository;
import org.huangly.util.TreeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrgService {

    @Autowired
    OrgRepository orgRepository;

    public Org insert(Org org) {
       return orgRepository.save(org);
    }
    public Org update(Org org){
        return orgRepository.save(org);
    }
    public void delete(String id){
        orgRepository.deleteById(id);
    }
    public List<Org> findAll(){
        List<Org> list=new ArrayList();
        orgRepository.findAll().iterator().forEachRemaining(
                org->list.add(org)
        );
        return (List<Org>) TreeUtil.listToTree(list);
    }
    public Org findById(String id) {
        return orgRepository.findById(id).orElseThrow(()-> new DataNoFundException());
    }

}
