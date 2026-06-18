package cn.kis2.mapper;

import cn.kis2.pojo.EmpExpr;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 员工经历
 */
@Mapper
public interface EmpExprMapper {

    /**
     * 添加工作经历
     */
     void insertBatch( List<EmpExpr> exprList);


    /**
     * 根据员工id删除员工经历
     * @param empIds
     */
    void deleteByEmpids(List<Integer> empIds);
}
