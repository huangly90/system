package org.huangly.service;

import org.huangly.domain.Subj;
import org.huangly.exception.DataNoFundException;
import org.huangly.repository.SubjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjService {

    @Autowired
    SubjRepository subjRepository;

    public Subj insert(Subj subj) {
       return subjRepository.save(subj);
    }
    public Subj update(Subj subj){
        return subjRepository.save(subj);
    }
    public void delete(String id){
        subjRepository.deleteById(id);
    }
    public List<Subj> findAll(){
        List<Subj> list=new ArrayList();
        subjRepository.findAll().iterator().forEachRemaining(
                subj->list.add(subj)
        );
        return list;
    }
    public Subj findById(String id) {
        return subjRepository.findById(id).orElseThrow(()-> new DataNoFundException());
    }

}
