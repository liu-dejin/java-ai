package cn.kis2.service.impl;


import cn.kis2.mapper.EmpExprMapper;
import cn.kis2.mapper.EmpMapper;
import cn.kis2.pojo.*;
import cn.kis2.service.EmpLogService;
import cn.kis2.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private EmpExprMapper empExprMapper;

    @Autowired
    private EmpLogService empLogService;

    // 原始分页方法
    // @Override
    // public PageResult<Emp> page(Integer page, Integer pageSize) {
    //     long count = empMapper.count();
    //     Integer start = (page - 1) * pageSize;
    //
    //     List<Emp> list = empMapper.list(start, pageSize);
    //     return new PageResult<>(count, list);
    // }


    // pageHelper实现
    // 注意事项
    // 1.定义的sql不能加分号
    // 2.仅仅能对跟在后面第一个查询语句生效
    // @Override
    // public PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end) {
    //     // 1.设置分页参数
    //     PageHelper.startPage(page, pageSize);
    //     // 2.执行查询
    //     List<Emp> empList = empMapper.list( name,  gender,  begin,  end);
    //     // List<Emp> empList2 = empMapper.list(); // 不生效
    //     Page<Emp> p = (Page<Emp>) empList;
    //
    //     // 3.解析查询结果
    //     return new PageResult<>(p.getTotal(), p.getResult());
    // }

    @Override
    public PageResult<Emp> page(EmpQueryParam empQueryParam) {
        // 1.设置分页参数
        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());
        // 2.执行查询
        List<Emp> empList = empMapper.list(empQueryParam);
        // List<Emp> empList2 = empMapper.list(); // 不生效
        Page<Emp> p = (Page<Emp>) empList;

        // 3.解析查询结果
        return new PageResult<>(p.getTotal(), p.getResult());
    }


    @Transactional(rollbackFor = {Exception.class})    // 事务管理的注解
    @Override
    public void add(Emp emp) throws Exception {
        try {
            // 1.保存基本信息
            emp.setCreateTime(LocalDateTime.now());
            emp.setUpdateTime(LocalDateTime.now());
            empMapper.insert(emp);


            // 2.保存工作经历
            List<EmpExpr> exprList = emp.getExprList();

            if (!CollectionUtils.isEmpty(exprList)) {
                // 遍历集合，设置empId
                exprList.forEach((EmpExpr) -> EmpExpr.setEmpId(emp.getId()));
                empExprMapper.insertBatch(exprList);
            }
        } finally {
            // 记录操作日志
            EmpLog empLog = new EmpLog(null, LocalDateTime.now(), "添加员工" + emp);
            empLogService.insertLog(empLog);
        }


    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void delete(List<Integer> ids) {
        // 1.批量删除员工的基本信息
        empMapper.deleteByIds(ids);
        // 2.批量删除员工的经历信息
        empExprMapper.deleteByEmpids(ids);
    }

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    @Override
    public Emp getInfo(Integer id) {
        return  empMapper.getById(id);
    }

    /**
     * 修改员工信息
     * @param emp
     */
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void update(Emp emp) {
        //1.根据id修改员工基本信息
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.updateById(emp);
        // 2.修改员工经历信息
        // 2.1根据员工id删除原有的工作经历
        empExprMapper.deleteByEmpids(Arrays.asList(emp.getId()));
        // 2.1添加新的工作经历
        List<EmpExpr> exprList = emp.getExprList();
        if (!CollectionUtils.isEmpty(exprList)) {
            exprList.forEach(empExpr -> empExpr.setEmpId(emp.getId()));
            empExprMapper.insertBatch(exprList);
        }
    }

    /**
     * 查询所有员工
     * @return
     */
    @Override
    public List<Emp> list() {
        return empMapper.AllList();
    }

}
