package cn.kis2.service;

import cn.kis2.pojo.Student;
import com.baomidou.mybatisplus.extension.service.IService;

public interface StudentService extends IService<Student> {

    /**
     * 违纪处理
     * @param id
     * @param score
     * @return
     */
    void dePoints(Integer id, Integer score);
}
