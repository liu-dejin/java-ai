package cn.kis2.controller;

import cn.kis2.pojo.Emp;
import cn.kis2.pojo.LoginInfo;
import cn.kis2.pojo.Result;
import cn.kis2.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping
    public Result login(@RequestBody Emp emp) {
        log.info("用户登录:{}",emp);
        LoginInfo info = loginService.login(emp);
        if(info==null){
            return Result.error("用户名或密码错误");
        }
       return Result.success(info);
    }
}
