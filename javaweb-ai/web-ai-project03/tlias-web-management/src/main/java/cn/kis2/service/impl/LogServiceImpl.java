package cn.kis2.service.impl;

import cn.kis2.mapper.LogMapper;
import cn.kis2.pojo.OperateLog;
import cn.kis2.pojo.PageResult;
import cn.kis2.pojo.Result;
import cn.kis2.service.LogService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;
    @Override
    public PageResult<OperateLog> list(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<OperateLog> operateLogs = logMapper.selectList();
        Page<OperateLog> op = (Page<OperateLog>) operateLogs;
        return new PageResult<>(op.getTotal(),op.getResult());
    }
}
