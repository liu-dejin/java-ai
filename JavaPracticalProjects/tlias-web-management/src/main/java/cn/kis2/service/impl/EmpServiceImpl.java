package cn.kis2.service.impl;

import cn.kis2.mapper.EmpMapper;
import cn.kis2.pojo.*;
import cn.kis2.service.DeptService;
import cn.kis2.service.ExprService;
import cn.kis2.service.EmpService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {
    @Autowired
    private DeptService deptService;

    @Autowired
    private ExprService exprService;

    /**
     * 保存员工信息和员工经历
     *
     * @param emp 员工信息
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveEmp(Emp emp) {
        // 基本信息
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        // 保存员工基本信息
        save(emp);
        // 批量保存工作经历信息
        // 获取员工工作经历
        List<EmpExpr> exprList = emp.getExprList();
        if (exprList != null && !exprList.isEmpty()) {
            exprList.forEach(expr -> {
                expr.setEmpId(emp.getId());
            });
            // 批量保存
            exprService.saveBatch(exprList);
        }
    }

    /**
     * 根据id查询员工信息和员工经历
     *
     * @param id 员工id
     * @return 员工信息
     */
    @Override
    public Emp getEmpById(Integer id) {
        // 1.查询基本信息
        Emp emp = getById(id);
        // 2.查询工作经历信息
        emp.setExprList(exprService.list(new LambdaQueryWrapper<EmpExpr>().eq(EmpExpr::getEmpId, id)));
        return emp;
    }

    /**
     * 更新员工信息和员工经历
     *
     * @param emp 员工信息
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateEmp(Emp emp) {
        // 保存员工基本信息
        emp.setUpdateTime(LocalDateTime.now());
        updateById(emp);
        // 删除工作经历信息
        exprService.remove(new LambdaQueryWrapper<EmpExpr>().eq(EmpExpr::getEmpId, emp.getId()));
        // 批量添加工作经历信息
        List<EmpExpr> exprList = emp.getExprList();
        if (exprList != null && !exprList.isEmpty()) {
            exprList.forEach(expr -> {
                expr.setEmpId(emp.getId());
            });
            // 批量保存
            exprService.saveBatch(exprList);
        }

    }

    /**
     * 批量删除员工信息和员工经历
     *
     * @param ids 员工id列表
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void removeEmpByIds(List<Integer> ids) {
        // 删除员工基本信息
        removeByIds(ids);
        // 删除工作经历
        exprService.remove(Wrappers.<EmpExpr>lambdaQuery().in(EmpExpr::getEmpId, ids));
    }

    /**
     * 分页查询员工信息
     *
     * @param param 查询条件
     * @return 分页结果
     */
    @Override
    public PageResult<Emp> getPageResult(EmpQueryParam param) {
        Page<Emp> page = new Page<>(param.getPage(), param.getPageSize());
        page.addOrder(OrderItem.desc("update_time"));

        // LambdaQueryWrapper<Emp> queryWrapper = new LambdaQueryWrapper<>();
        // queryWrapper.like(param.getName() != null && !param.getName().isEmpty(), Emp::getName, param.getName()).eq(param.getGender() != null, Emp::getGender, param.getGender()).between(param.getBegin() != null && param.getEnd() != null, Emp::getEntryDate, param.getBegin(), param.getEnd());
        //
        // page = page(page, queryWrapper);

        page = lambdaQuery().like(param.getName() != null && !param.getName().isEmpty(), Emp::getName, param.getName()).eq(param.getGender() != null, Emp::getGender, param.getGender()).between(param.getBegin() != null && param.getEnd() != null, Emp::getEntryDate, param.getBegin(), param.getEnd()).page(page);

        List<Emp> emps = page.getRecords();
        // 遍历员工集合 获取到部门名称
        List<Integer> deptIds = emps.stream().map(Emp::getDeptId).toList();
        if (!deptIds.isEmpty()) {
            // 根据部门id集合查询部门信息
            List<Dept> depts = deptService.listByIds(deptIds);
            // 遍历员工集合 查找员工的部门名称
            emps.forEach(emp -> {
                depts.forEach(dept -> {
                    if (emp.getDeptId() != null && emp.getDeptId().equals(dept.getId())) {
                        emp.setDeptName(dept.getName());
                    }
                });
            });
        }
        return new PageResult<>(page.getTotal(), emps);


    }
}
