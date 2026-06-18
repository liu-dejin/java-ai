package cn.kis2.service;

import cn.kis2.pojo.Emp;
import cn.kis2.pojo.EmpQueryParam;
import cn.kis2.pojo.PageResult;

import java.util.List;


public interface EmpService {

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    // PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
    /**
     * 分页查询
     * @param empQueryParam
     * @return
     */
    PageResult<Emp> page(EmpQueryParam empQueryParam);

    /**
     * 添加员工
     * @param emp
     */
    void add(Emp emp) throws Exception;

    /**
     * 删除员工
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 根据id查询员工信息
     *
     * @return
     */
    Emp getInfo(Integer id);

    /**
     * 修改员工信息
     * @param emp
     */
    void update(Emp emp);

    /**
     * 查询所有员工
     * @return
     */
    List<Emp> list();
}
