package cn.kis2.service;


import cn.kis2.pojo.JobOption;

import java.util.List;
import java.util.Map;

public interface ReportService {
    /**
     * 统计员工职位人数
     * @return
     */
    JobOption getEmpJobData();

    /**
     * 统计员工性别人数
     * @return
     */
    List<Map<String, Object>> getEmpGenderData();

    /**
     * 统计学历信息
     * @return
     */
    List<Map<String, Object>> getStudentDegreeData();
}
