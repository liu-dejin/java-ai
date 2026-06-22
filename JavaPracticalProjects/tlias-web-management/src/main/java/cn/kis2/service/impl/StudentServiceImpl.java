package cn.kis2.service.impl;

import cn.kis2.mapper.StudentMapper;
import cn.kis2.pojo.Student;
import cn.kis2.service.StudentService;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

 @Override
 public void dePoints(Integer id, Integer score) {
  UpdateWrapper<Student> updateWrapper = new UpdateWrapper<>();
  updateWrapper.eq("id", id).setSql("violation_count = violation_count + 1").setSql("violation_score = violation_score + " + score);
  update(updateWrapper);
 }
}
