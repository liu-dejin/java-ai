package cn.kis2.mapper;

import cn.kis2.pojo.Emp;
import cn.kis2.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * 员工信息
 */
@Mapper
public interface EmpMapper {
//--------------------------原始方法--------------------------------------
    // /**
    //  * 查询总记录数
    //  */
    // @Select("select count(*) from emp e left join dept d on e.dept_id = d.id;")
    // long count();
    //
    // /**
    //  * 查询员工列表数据
    //  */
    // @Select("select e.*, d.name deptName from emp e  left join dept d on e.dept_id = d.id order by e.update_time desc limit #{start},#{pageSize}")
    // List<Emp> list(Integer start, Integer pageSize);

    /**
     *  使用pageHelper查询员工
     */
    // List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);

    /**
     * 条件查询员工
     */

    List<Emp> list(EmpQueryParam empQueryParam);


    @Options(useGeneratedKeys = true, keyProperty = "id") // 获取到生成的主键 - 主键返回
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time) values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime});")
    void insert(Emp emp);


    /**
     * 删除员工
     *
     * @param ids
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 根据id查询员工信息以及工作经历
     *
     * @param id
     * @return
     */
    Emp getById(Integer id);

    /**
     * 根据id更新员工基本信息
     */
    void updateById(Emp emp);

    /**
     * 职位统计人数
     */
    @MapKey("pos")
    List<Map<String, Object>> countEmpJobData();

    /**
     * 性别统计人数
     * @return
     */
    @MapKey("name")
    List<Map<String, Object>> countEmpGenderData();

    /**
     * 查询所有员工
     * @return
     */
    @Select("select id, username, password, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time from emp")
    List<Emp> AllList();

    /**
     * 学历统计人数
     * @return
     */
    List<Map<String, Object>> countStudentDegreeData();

    /**
     * 登录 根据用户名密码查询用户
     * @param emp
     */
    @Select("select id,username,name from emp where username = #{username} and password = #{password};")
    Emp SelectByUsernameAndPassword(Emp emp);
}

