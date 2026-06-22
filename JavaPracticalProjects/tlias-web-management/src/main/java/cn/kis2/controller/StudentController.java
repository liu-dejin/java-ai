package cn.kis2.controller;

import cn.kis2.pojo.*;
import cn.kis2.service.ClazzService;
import cn.kis2.service.StudentService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ClazzService clazzService;

    @GetMapping
    public Result list(StudentQueryParam student) {
        log.info("查询所有学生信息：{}", student);
        Page<Student> pageParams = new Page<>(student.getPage(), student.getPageSize());
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(student.getName() != null && !student.getName().isEmpty(), Student::getName, student.getName())
                .eq(student.getClazzId() != null, Student::getClazzId, student.getClazzId()).eq(student.getDegree() != null, Student::getDegree, student.getDegree());
        Page<Student> resul = studentService.page(pageParams, queryWrapper);
        resul.getRecords().forEach(s -> {
            Clazz cId = clazzService.getById(s.getClazzId());
            s.setClazzName(cId.getName());
        });
        PageResult<Student> pageResult = new PageResult<>(resul.getTotal(), resul.getRecords());
        return Result.success(pageResult);
    }

    @PostMapping
    public Result save(@RequestBody Student student) {
        log.info("新增学生信息：{}", student);
        student.setCreateTime(LocalDateTime.now());
        student.setUpdateTime(LocalDateTime.now());
        studentService.save(student);

        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据id查询学生信息：{}", id);
        Student s = studentService.getById(id);
        return Result.success(s);
    }

    @PutMapping
    public Result update(@RequestBody Student student) {
        log.info("修改学生信息：{}", student);
        student.setUpdateTime(LocalDateTime.now());
        studentService.updateById(student);
        return Result.success();
    }

    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids) {
        log.info("根据id删除学生信息：{}", ids);
        studentService.removeBatchByIds(ids);
        return Result.success();
    }

    @PutMapping("/violation/{id}/{score}")
    public Result violation(@PathVariable Integer id, @PathVariable Integer score) {
        log.info("根据id{}扣分, 扣分：{}", id, score);
        studentService.dePoints(id, score);
        return Result.success();
    }
}
