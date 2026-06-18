package cn.kis2.mapper;


import cn.kis2.pojo.Student;
import cn.kis2.pojo.StudentQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 根据班级id查询学生数量
     * @param clazzId
     * @return
     */
    @Select("SELECT COUNT(*) FROM student WHERE clazz_id = #{clazzId}")
    int countByClazzId(Integer clazzId);

    /**
     *
     * @param studentQueryParam
     */
    List<Student> getStudentList(StudentQueryParam studentQueryParam);

    /**
     * 添加学生
     * @param student
     */

    void insert(Student student);

    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    @Select("select id, name, no, gender, phone, id_card, is_college, address, degree, graduation_date, clazz_id, violation_count, violation_score, create_time, update_time from student where id=#{id}")
    Student getById(Integer id);

    /**
     * 修改员工信息
     * @param student
     */

    void update(Student student);

    /**
     * 删除
     * @param ids
     */
    void deleteBatchIds(List<Integer> ids);

    /**
     * 违纪处理
     * @param id
     * @param score
     */
    @Update("update student set violation_count = violation_count + 1, violation_score = violation_score + #{score} where id = #{id}")
    void handleViolation(Integer id, Integer score);
}
