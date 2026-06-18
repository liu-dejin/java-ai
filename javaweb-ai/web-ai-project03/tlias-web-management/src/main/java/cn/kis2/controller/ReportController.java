package cn.kis2.controller;

import cn.kis2.pojo.JobOption;
import cn.kis2.pojo.Result;
import cn.kis2.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("/report")
@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    /**
     * 统计员工职位人数
     *
     * @return
     */
    @GetMapping("/empJobData")
    public Result getEmpJobData() {
        log.info("统计员工职位人数");
        JobOption jobOption = reportService.getEmpJobData();
        return Result.success(jobOption);
    }

    /**
     * 统计员工性别人数
     *
     * @return
     */
    @GetMapping("/empGenderData")
    public Result getEmpGenderData() {
        log.info("统计员工性别人数");
        List<Map<String, Object>> genderList =reportService.getEmpGenderData();
        return Result.success(genderList);
    }

    /**
     * 学员学历统计
     *
     */
    @GetMapping("/studentDegreeData")
    public Result getStudentDegreeData() {
        log.info("学员学历统计");
        List<Map<String, Object>> eduList = reportService.getStudentDegreeData();
        return Result.success(eduList);
    }
}
