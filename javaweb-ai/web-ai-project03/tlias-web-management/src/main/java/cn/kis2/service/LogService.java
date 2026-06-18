package cn.kis2.service;

import cn.kis2.pojo.OperateLog;
import cn.kis2.pojo.PageResult;
import cn.kis2.pojo.Result;

public interface LogService {
    PageResult<OperateLog> list(Integer page, Integer pageSize);
}
