package cn.kis2.mapper;

import cn.kis2.pojo.OperateLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LogMapper {
    @Select("select o.*,e.name   operateEmpName  from operate_log o,emp e where o.operate_emp_id = e.id")
    List<OperateLog> selectList( );
}
