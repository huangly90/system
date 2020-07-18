package org.huangly.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.huangly.common.Result;
import org.huangly.domain.ReportData;
import org.huangly.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
@Api(value = "报表数据",tags = "报表数据")
public class ReportController {


    @Autowired
    ReportService reportService;
    @ApiOperation("报表查询")
    @GetMapping("/")
    public  Result<String> query(){
        return Result.fail("正在处理中...");
    }

    @ApiOperation("新增")

    @PostMapping()
    public  Result<String> insert(@RequestBody ReportData reportData){
        reportService.insert(reportData);
        return  Result.success();
    }
}
