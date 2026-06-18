package cn.kis2.controller;

import cn.kis2.pojo.PageResult;
import cn.kis2.pojo.Result;
import cn.kis2.pojo.Student;
import cn.kis2.pojo.StudentQueryParam;
import cn.kis2.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/students")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 获取学生列表
     * @return
     */
    @GetMapping
    public Result page(StudentQueryParam studentQueryParam) {
        log.info("获取学生列表:{}", studentQueryParam);
        PageResult<Student> pageResult = studentService.page(studentQueryParam);
        return Result.success(pageResult);
    }

    /**
     * 新增学生
     */
    @PostMapping
    public Result add(@RequestBody Student student) {
        log.info("新增学生:{}", student);
        studentService.add(student);
        return Result.success();
    }

    /**
     * 根据id查询学生
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据id查询学生:{}", id);
        Student student = studentService.getById(id);
        return Result.success(student);
    }

    /**
     * 修改学生信息
     */
    @PutMapping
    public Result update(@RequestBody Student student) {
        log.info("修改学生信息:{}", student);
        studentService.update(student);
        return Result.success();
    }

    /**
     * 删除学生
     * @param ids
     * @return
     */
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids) {
        log.info("删除学生:{}", ids);
        studentService.delete(ids);
        return Result.success();
    }

    /**
     * 违纪处理
     */
    @PutMapping("/violation/{id}/{score}")
    public Result handleViolation(@PathVariable Integer id , @PathVariable Integer score ) {
        log.info("违纪处理:{},{}", id,score);
        studentService.handleViolation(id,score);
        return Result.success();
    }
}
