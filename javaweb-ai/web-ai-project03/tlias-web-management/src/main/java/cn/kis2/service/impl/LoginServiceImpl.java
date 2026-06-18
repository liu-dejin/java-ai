package cn.kis2.service.impl;

import cn.kis2.mapper.EmpMapper;
import cn.kis2.pojo.Emp;
import cn.kis2.pojo.LoginInfo;
import cn.kis2.service.LoginService;
import cn.kis2.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public LoginInfo login(Emp emp) {
        // 查询员工信息
        Emp empRes = empMapper.SelectByUsernameAndPassword(emp);
        // 判断是否存在 存在组装数据
        if (empRes != null) {
            log.info("用户登录成功:{}", empRes);
            // 生成jwt令牌
            HashMap<String, Object> claims = new HashMap<>();
            claims.put("id", empRes.getId());
            claims.put("username", empRes.getUsername());
            String jwt = JwtUtils.generateJwt(claims);
            return new LoginInfo(empRes.getId(), empRes.getUsername(), empRes.getName(), jwt);
        }
        // 不存在返回null
        return null;

    }
}
