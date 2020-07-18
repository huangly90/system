package org.huangly.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.huangly.common.Result;
import org.huangly.domain.SubjStruct;
import org.huangly.service.SubjStructService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(value = "科目结构",tags = "科目结构")
@RestController
@RequestMapping("/subjStruct")
public class SubjStructConrtoller {
    @Autowired
    SubjStructService subjStructService;

    @GetMapping
    @ApiOperation("查询所有")
    public Result<List<SubjStruct>> listAll(){
        return Result.success(subjStructService.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id查找")
    public Result<SubjStruct> findById(@PathVariable String id){
        return Result.success(subjStructService.findById(id));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id删除")
    public  Result<String> deleteById(@PathVariable String id){
        subjStructService.delete(id);
        return  Result.success();
    }

    @PostMapping
    @ApiOperation("根据id新增啊")
    public  Result insert(@RequestBody SubjStruct subjStruct){
        subjStructService.insert(subjStruct);
        return  Result.success();
    }

    @PutMapping("/{id}")
    @ApiOperation("根据id更新")
    public Result update(@PathVariable String id,@RequestBody SubjStruct subjStruct){
        subjStruct.setId(id);
        subjStructService.update(subjStruct);
        return Result.success();
    }
}
