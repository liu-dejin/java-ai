package cn.kis2.service;

import cn.kis2.pojo.PageResult;
import cn.kis2.pojo.Student;
import cn.kis2.pojo.StudentQueryParam;

import java.util.List;

public interface StudentService {

    PageResult<Student> page(StudentQueryParam studentQueryParam);

    void add(Student student);

    Student getById(Integer id);

    void update(Student student);

    void delete(List<Integer> ids);

    void handleViolation(Integer id, Integer score);
}
