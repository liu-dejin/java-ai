package cn.kis2.controller;

import cn.kis2.pojo.Clazz;
import cn.kis2.pojo.ClazzQueryParam;
import cn.kis2.pojo.PageResult;
import cn.kis2.pojo.Result;
import cn.kis2.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/clazzs")
@RestController
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    /**
     * 获取班级列表
     * @param clazzQueryParam
     * @return
     */
    @GetMapping()
    public Result getClazzs(ClazzQueryParam clazzQueryParam) {
        log.info("获取班级列表:{}",clazzQueryParam);
        PageResult<Clazz> pageResult = clazzService.page(clazzQueryParam);
        return Result.success(pageResult);
    }

    /**
     * 新增班级
     *
     */
    @PostMapping()
    public Result addClazz(@RequestBody Clazz clazz) {
        log.info("新增班级:{}",clazz);
        clazzService.add(clazz);
        return Result.success();
    }

    /**
     * 根据ID查询班级接口
     */
    @GetMapping("/{id}")
    public Result getClazzById(@PathVariable Integer id) {
        log.info("根据ID查询班级:{}",id);
        Clazz clazz = clazzService.getById(id);
        return Result.success(clazz);
    }

    /**
     * 修改班级信息
     * @param clazz
     */
    @PutMapping()
    public Result updateClazz(@RequestBody Clazz clazz) {
        log.info("修改班级信息:{}",clazz);
        clazzService.update(clazz);
        return Result.success();
    }

    /**
     * 删除班级
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result deleteClazz(@PathVariable Integer id) {
        log.info("删除班级:{}",id);
        clazzService.delete(id);
        return Result.success();
    }

    /**
     * 查询全部班级
     */
    @GetMapping("/list")
    public Result list() {
        log.info("查询全部班级");
        List<Clazz> clazzList = clazzService.list();
        return Result.success(clazzList);
    }
}
