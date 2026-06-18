package cn.kis2.service.impl;

import cn.kis2.exception.BusinessException;
import cn.kis2.mapper.ClazzMapper;
import cn.kis2.mapper.StudentMapper;
import cn.kis2.pojo.Clazz;
import cn.kis2.pojo.ClazzQueryParam;
import cn.kis2.pojo.PageResult;
import cn.kis2.service.ClazzService;
import cn.kis2.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzMapper clazzMapper;

    @Autowired
    private StudentMapper studentMapper;
    /**
     * 分页查询
     * @param clazzQueryParam
     * @return
     */
    @Override
    public PageResult<Clazz> page(ClazzQueryParam clazzQueryParam) {
        PageHelper.startPage(clazzQueryParam.getPage(), clazzQueryParam.getPageSize());

        List<Clazz> clazzList = clazzMapper.list(clazzQueryParam);
        Page<Clazz> p = (Page<Clazz>) clazzList;
        return new PageResult<>(p.getTotal(), p.getResult());
    }

    /**
     * 添加班级
     * @param clazz
     */
    @Override
    public void add(Clazz clazz) {
        clazz.setCreateTime(LocalDateTime.now());
        clazz.setUpdateTime(LocalDateTime.now());
        clazzMapper.insert(clazz);
    }

    /**
     * 根据id查询班级
     * @param id
     * @return
     */
    @Override
    public Clazz getById(Integer id) {
        return clazzMapper.getById(id);
    }

    @Override
    public void update(Clazz clazz) {
        clazz.setUpdateTime(LocalDateTime.now());
        clazzMapper.update(clazz);
    }

    /**
     * 删除班级
     * @param id
     */
    @Override
    public void delete(Integer clazzId) {
        int studentCount = studentMapper.countByClazzId(clazzId);
        if (studentCount>0){
            throw new BusinessException("班级下存在学生，无法删除");
        }
        clazzMapper.deleteById(clazzId);
    }

    /**
     * 查询全部班级
     * @return
     */
    @Override
    public List<Clazz> list() {
        return clazzMapper.allList();
    }
}
