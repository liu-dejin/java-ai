package cn.kis2.mapper;

import cn.kis2.pojo.Clazz;
import cn.kis2.pojo.ClazzQueryParam;
import cn.kis2.pojo.PageResult;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClazzMapper {

    /**
     * 分页查询班级
     * @param clazzQueryParam
     * @return
     */
    List<Clazz> list(ClazzQueryParam clazzQueryParam);

    /**
     * 添加班级
     * @param clazz
     */
    @Insert("insert into clazz ( name, room, begin_date, end_date, master_id, subject, create_time, update_time) values (#{name},#{room},#{beginDate},#{endDate},#{masterId},#{subject},#{createTime},#{updateTime})")
    void insert(Clazz clazz);

    /**
     * 根据id查询班级
     * @param id
     * @return
     */
    @Select("select id, name, room, begin_date, end_date, master_id, subject, create_time, update_time from clazz where id=#{id}")
    Clazz getById(Integer id);

    /**
     * 修改班级信息
     *
     */
    @Update("update clazz set name=#{name},room=#{room},begin_date=#{beginDate},end_date=#{endDate},master_id=#{masterId},subject=#{subject},update_time=#{updateTime} where id=#{id}")
    void update(Clazz clazz);

    /**
     * 删除班级
     * @param clazzId
     */
    @Delete("delete from clazz where id=#{clazzId}")
    void deleteById(Integer clazzId);

    /**
     * 查询所有班级
     * @return
     */
    @Select("select id, name, room, begin_date, end_date, master_id, subject, create_time, update_time from clazz")
    List<Clazz> allList();
}
