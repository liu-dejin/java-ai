package cn.kis2.controller;

import cn.kis2.pojo.OperateLog;
import cn.kis2.pojo.PageResult;
import cn.kis2.pojo.Result;
import cn.kis2.service.LogService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogService logService;

    // 查询日志列表
    @GetMapping("/page")
    public Result list(Integer page, Integer pageSize) {
        PageResult<OperateLog> list = logService.list(page, pageSize);
        return Result.success(list);
    }
}
