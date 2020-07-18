package org.huangly.controller;

import org.huangly.common.Result;
import org.huangly.domain.Org;
import org.huangly.domain.Subj;
import org.huangly.service.SubjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SubjConrtoller {
    @Autowired
    SubjService subjService;

    @GetMapping
    public Result<List<Subj>> listAll(){
        return Result.success(subjService.findAll());
    }

    @GetMapping("/{id}")
    public Result<Subj> findById(@PathVariable String id){
        return Result.success(subjService.findById(id));
    }

    @DeleteMapping("/{id}")
    public  Result<String> deleteById(@PathVariable String id){
        subjService.delete(id);
        return  Result.success();
    }

    @PostMapping
    public  Result insert(@RequestBody Subj subj){
        subjService.insert(subj);
        return  Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Subj subj){
        Assert.isNull(subj.getId(),"更新失败，id不能为空");
        subjService.update(subj);
        return Result.success();
    }
}
