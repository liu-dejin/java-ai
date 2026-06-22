package cn.kis2;

import cn.kis2.mapper.EmpMapper;
import cn.kis2.pojo.Emp;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class QueryWrapperTest {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testQueryWrapper() {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", '李').ge("salary", "5000").select("id", "name", "phone", "salary");
        List<Emp> empList = empMapper.selectList(queryWrapper);
        empList.forEach(System.out::println);
    }
    @Test
    public void testLambdaQueryWrapper() {
        LambdaQueryWrapper<Emp> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(Emp::getName, '李').ge(Emp::getSalary, "5000").select(Emp::getId, Emp::getName, Emp::getPhone, Emp::getSalary);
        List<Emp> empList = empMapper.selectList(queryWrapper);
        empList.forEach(System.out::println);
    }

    @Test
    public void testQueryWrapper2() {
        Emp emp = new Emp();
        emp.setSalary(9000);
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", "李忠");
        empMapper.update(emp, queryWrapper);
    }


    @Test
    public void testLambdaQueryWrapper2() {
        Emp emp = new Emp();
        emp.setSalary(9000);
        LambdaQueryWrapper<Emp> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Emp::getName, "李忠");
        empMapper.update(emp, queryWrapper);
    }

    @Test
    public void testUpdateWrapper() {
        UpdateWrapper<Emp> updateWrapper = new UpdateWrapper<>();
        updateWrapper.in("id", 1, 2, 3).setSql("salary = salary +2000");
        empMapper.update( updateWrapper);
    }
    @Test
    public void testLambdaUpdateWrapper() {
        LambdaUpdateWrapper<Emp> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.in(Emp::getId, 1, 2, 3).setSql("salary = salary +2000");
        empMapper.update( updateWrapper);
    }
}
