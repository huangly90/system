package org.huangly.controller;


import org.huangly.common.Result;
import org.huangly.domain.Org;
import org.huangly.domain.OrgStruct;
import org.huangly.service.OrgStructService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orgStruct")
public class OrgStructController {

    @Autowired
    OrgStructService orgStructService;

    @GetMapping
    public Result<List<OrgStruct>> listAll(){
        return Result.success(orgStructService.findAll());
    }

    @GetMapping("/{id}")
    public Result<OrgStruct> findById(@PathVariable String id){
        return Result.success(orgStructService.findById(id));
    }

    @DeleteMapping("/{id}")
    public  Result<String> deleteById(@PathVariable String id){
        orgStructService.delete(id);
        return  Result.success();
    }

    @PostMapping
    public  Result insert(@RequestBody OrgStruct orgStruct){
        orgStructService.insert(orgStruct);
        return  Result.success();
    }

    @PutMapping
    public Result update(@RequestBody OrgStruct orgStruct){
        Assert.isNull(orgStruct.getId(),"更新失败，id不能为空");
        orgStructService.update(orgStruct);
        return Result.success();
    }
}
