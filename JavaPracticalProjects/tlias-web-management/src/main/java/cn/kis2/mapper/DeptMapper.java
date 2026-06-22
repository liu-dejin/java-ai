package cn.kis2.mapper;

import cn.kis2.pojo.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

    // @Select("select id, name, create_time, update_time from dept order by update_time desc ")
    // List<Dept> findAll();
    //
    // @Delete("delete from dept where id = #{id}")
    // void deleteById(Integer id);
    //
    // @Insert("insert into dept(name, create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    // void save(Dept dept);
    //
    Dept getById(Integer id);
    //
    // @Update("update dept set name = #{name}, update_time = #{updateTime} where id = #{id}")
    // void update(Dept dept);
}
