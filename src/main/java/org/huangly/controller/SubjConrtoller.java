package org.huangly.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.huangly.common.Result;
import org.huangly.domain.Subj;
import org.huangly.service.SubjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(value = "末级科目",tags = "末级科目")
@RestController
@RequestMapping("/subj")
public class SubjConrtoller {
    @Autowired
    SubjService subjService;

    @GetMapping
    @ApiOperation("查询所有")
    public Result<List<Subj>> listAll(){
        return Result.success(subjService.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id查询")
    public Result<Subj> findById(@PathVariable String id){
        return Result.success(subjService.findById(id));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id删除")
    public  Result<String> deleteById(@PathVariable String id){
        subjService.delete(id);
        return  Result.success();
    }

    @PostMapping
    @ApiOperation("新增")
    public  Result insert(@RequestBody Subj subj){
        subjService.insert(subj);
        return  Result.success();
    }

    @PutMapping("/{id}")
    @ApiOperation("根据id更新")
    public Result update(@PathVariable String id ,@RequestBody Subj subj){
        subj.setId(id);
        subjService.update(subj);
        return Result.success();
    }
}
