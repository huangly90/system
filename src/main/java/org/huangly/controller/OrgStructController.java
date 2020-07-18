package org.huangly.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.huangly.common.Result;
import org.huangly.domain.OrgStruct;
import org.huangly.service.OrgStructService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "组织架构",tags = "组织架构")
@RestController
@RequestMapping("/orgStruct")
public class OrgStructController {

    @Autowired
    OrgStructService orgStructService;

    @GetMapping
    @ApiOperation("查询所有")
    public Result<List<OrgStruct>> listAll(){
        return Result.success(orgStructService.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id查询")
    public Result<OrgStruct> findById(@PathVariable String id){
        return Result.success(orgStructService.findById(id));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id删除")
    public  Result<String> deleteById(@PathVariable String id){
        orgStructService.delete(id);
        return  Result.success();
    }

    @PostMapping
    @ApiOperation("新增")
    public  Result insert(@RequestBody OrgStruct orgStruct){
        orgStructService.insert(orgStruct);
        return  Result.success();
    }

    @PutMapping("/{id}")
    @ApiOperation("根据id更新")
    public Result update(@PathVariable String id,@RequestBody OrgStruct orgStruct){
        orgStruct.setId(id);
        orgStructService.update(orgStruct);
        return Result.success();
    }
}
