package cn.kis2.service;

import cn.kis2.pojo.Emp;
import cn.kis2.pojo.EmpQueryParam;
import cn.kis2.pojo.PageResult;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface EmpService extends IService<Emp>{

    /**
     * 分页查询员工信息
     * @param param 查询条件
     * @return 分页结果
     */
    PageResult<Emp> getPageResult(EmpQueryParam param);

    /**
     * 保存员工信息和员工经历
     * @param emp 员工信息
     */
    void saveEmp(Emp emp);

    /**
     * 根据id查询员工信息和员工经历
     * @param id 员工id
     * @return 员工信息
     */
    Emp getEmpById(Integer id);

    /**
     * 更新员工信息和员工经历
     * @param emp 员工信息
     */
    void updateEmp(Emp emp);

    /**
     * 批量删除员工信息和员工经历
     * @param ids 员工id列表
     */
    void removeEmpByIds(List<Integer> ids);
}
