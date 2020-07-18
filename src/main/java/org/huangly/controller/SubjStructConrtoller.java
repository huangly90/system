package org.huangly.controller;

import org.huangly.common.Result;
import org.huangly.domain.Org;
import org.huangly.domain.SubjStruct;
import org.huangly.service.OrgService;
import org.huangly.service.SubjStructService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SubjStructConrtoller {
    @Autowired
    SubjStructService subjStructService;

    @GetMapping
    public Result<List<SubjStruct>> listAll(){
        return Result.success(subjStructService.findAll());
    }

    @GetMapping("/{id}")
    public Result<SubjStruct> findById(@PathVariable String id){
        return Result.success(subjStructService.findById(id));
    }

    @DeleteMapping("/{id}")
    public  Result<String> deleteById(@PathVariable String id){
        subjStructService.delete(id);
        return  Result.success();
    }

    @PostMapping
    public  Result insert(@RequestBody SubjStruct subjStruct){
        subjStructService.insert(subjStruct);
        return  Result.success();
    }

    @PutMapping
    public Result update(@RequestBody SubjStruct subjStruct){
        Assert.isNull(subjStruct.getId(),"更新失败，id不能为空");
        subjStructService.update(subjStruct);
        return Result.success();
    }
}
