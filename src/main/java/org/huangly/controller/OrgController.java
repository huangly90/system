package org.huangly.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.huangly.common.Result;
import org.huangly.domain.Org;
import org.huangly.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(value = "公司主体",tags = "公司主体")
@RestController
@RequestMapping("/org")
public class OrgController {

    @Autowired
    OrgService orgService;

    @GetMapping
    @ApiOperation("查询所有")
    public Result<List<Org>> listAll(){
        return Result.success(orgService.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation("根据Id查询")
    public Result<Org> findById(@PathVariable String id){
        return Result.success(orgService.findById(id));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据Id删除")
    public  Result<String> deleteById(@PathVariable String id){
         orgService.delete(id);
        return  Result.success();
    }

    @PostMapping
    @ApiOperation("新增")
    public  Result insert(@RequestBody Org org){
        orgService.insert(org);
        return  Result.success();
    }

    @PutMapping("/{id}")
    @ApiOperation("根据id更新")
    public Result update(@PathVariable String id,@RequestBody Org org){
//        Assert.isNull(org.getId(),"更新失败，id不能为空");
        org.setId(id);
        orgService.update(org);
        return Result.success();
    }
}
