package org.huangly.controller;


import org.huangly.common.Result;
import org.huangly.domain.Org;
import org.huangly.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/org")
public class OrgController {

    @Autowired
    OrgService orgService;

    @GetMapping
    public Result<List<Org>> listAll(){
        return Result.success(orgService.findAll());
    }

    @GetMapping("/{id}")
    public Result<Org> findById(@PathVariable String id){
        return Result.success(orgService.findById(id));
    }

    @DeleteMapping("/{id}")
    public  Result<String> deleteById(@PathVariable String id){
         orgService.delete(id);
        return  Result.success();
    }

    @PostMapping
    public  Result insert(@RequestBody Org org){
        orgService.insert(org);
        return  Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Org org){
        Assert.isNull(org.getId(),"更新失败，id不能为空");
        orgService.update(org);
        return Result.success();
    }
}
