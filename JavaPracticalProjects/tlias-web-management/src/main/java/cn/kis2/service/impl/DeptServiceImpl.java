package cn.kis2.service.impl;

import cn.kis2.mapper.DeptMapper;
import cn.kis2.pojo.Dept;
import cn.kis2.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper,Dept> implements DeptService {

}
