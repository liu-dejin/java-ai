package cn.kis2.controller;

import cn.kis2.pojo.Result;
import cn.kis2.service.EmpService;
import cn.kis2.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private EmpService empService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/empJobData")
    public Result getEmpJobData(){
        log.info("员工职位人数统计");

        return Result.success();
    }

    @GetMapping("/empGenderData")
    public Result getEmpGenderData(){
        log.info("员工性别人数统计");

        return Result.success();
    }

    @GetMapping("/studentCountData")
    public Result studentCountData() {
        log.info("班级人数统计...");

        return Result.success();
    }

    @GetMapping("/studentDegreeData")
    public Result studentDegreeData() {
        log.info("学员学历统计...");

        return Result.success();
    }
}
