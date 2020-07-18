package org.huangly.service;

import org.huangly.domain.Subj;
import org.huangly.domain.SubjStruct;
import org.huangly.exception.DataNoFundException;
import org.huangly.repository.SubjRepository;
import org.huangly.repository.SubjStructRepository;
import org.huangly.util.TreeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjStructService {

    @Autowired
    SubjStructRepository subjStructRepository;

    public SubjStruct insert(SubjStruct subj) {
       return subjStructRepository.save(subj);
    }
    public SubjStruct update(SubjStruct subj){
        return subjStructRepository.save(subj);
    }
    public void delete(String id){
        subjStructRepository.deleteById(id);
    }
    public List<SubjStruct> findAll(){
        List<SubjStruct> list=new ArrayList();
        subjStructRepository.findAll().iterator().forEachRemaining(
                subjStruct->list.add(subjStruct)
        );

        return (List<SubjStruct>) TreeUtil.listToTree(list);
    }
    public SubjStruct findById(String id) {
        return subjStructRepository.findById(id).orElseThrow(()-> new DataNoFundException());
    }

}
