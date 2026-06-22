package cn.kis2.controller;

import cn.kis2.pojo.Clazz;
import cn.kis2.pojo.Emp;
import cn.kis2.pojo.PageResult;
import cn.kis2.pojo.Result;
import cn.kis2.service.ClazzService;
import cn.kis2.service.EmpService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequestMapping("/clazzs")
@RestController
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result list(String name,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end,
                       @RequestParam(defaultValue = "1") int page,
                       @RequestParam(defaultValue = "10") int pageSize) {
        log.info("查询班级列表，name={}, begin={}, end={}, page={}, pageSize={}", name, begin, end, page, pageSize);
        Page<Clazz> pageParams = new Page<>(page, pageSize);
        LambdaQueryWrapper<Clazz> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name != null && !name.isEmpty(), Clazz::getName, name)
                .ge(begin != null, Clazz::getBeginDate, begin)
                .le(end != null, Clazz::getEndDate, end);
        Page<Clazz> resul = clazzService.page(pageParams, queryWrapper);
        resul.getRecords().forEach(clazz -> {
            // 设置班级状态
            clazz.setStatus(clazz.getEndDate().isAfter(LocalDate.now()) ? "未结课" : "已结课");
            // 设置班主任姓名
            Emp emp = empService.getById(clazz.getMasterId());
            if (emp != null) {
                clazz.setMasterName(emp.getName());
            }
        });
        PageResult<Clazz> pageResult = new PageResult<>(resul.getTotal(), resul.getRecords());
        return Result.success(pageResult);
    }

    @PostMapping
    public Result save(@RequestBody Clazz clazz) {
        log.info("新增班级：{}", clazz);
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(LocalDateTime.now());
        clazzService.save(clazz);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据id查询班级：{}", id);
        Clazz c = clazzService.getById(id);
        return Result.success(c);
    }

    @PutMapping
    public Result update(@RequestBody Clazz clazz) {
        log.info("修改班级：{}", clazz);
        clazzService.updateById(clazz);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("删除班级：{}", id);
        clazzService.removeById(id);
        return Result.success();
    }

    @GetMapping("/list")
    public Result list() {
        log.info("查询全部班级");
        List<Clazz> list = clazzService.list();
        return Result.success(list);
    }
}
