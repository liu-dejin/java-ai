package cn.kis2.mapper;

import cn.kis2.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 运行时会给该接口创建一个实现对象 (代理对象) 并存入到ioc容器
public interface UserMapper {
    /*
    查询所有用户
     */
    List<User> findAll();

    /*
    根据id删除用户信息
     */
    @Delete("delete from user where id = #{id}")
    Integer deleteById(Integer id);

    /*
     新增用户
     */
    @Insert("insert into user (username, password, name, age) values (#{username}, #{password}, #{name}, #{age});")
    void insert(User user);
    /*
    根据id更新用户信息
     */
    @Update("update user set username = #{username}, password = #{password}, name = #{name}, age = #{age} where id = #{id}")
    void update(User user);
    /*
    根据用户名密码查询用户信息
     */
    @Select("select * from user where username = #{username} and password = #{password};")
    // User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password); 基于官方骨架创建的springboot?项目中，接口编译时会保留方法形参名，@Param注解可以省略(#{形参名})。
    User findByUsernameAndPassword( String username, String password);
}
