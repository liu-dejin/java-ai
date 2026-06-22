package cn.kis2.service.impl;

import cn.kis2.mapper.EmpExprMapper;
import cn.kis2.pojo.EmpExpr;
import cn.kis2.service.ExprService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ExprServiceImpl extends ServiceImpl<EmpExprMapper, EmpExpr> implements ExprService {
}
