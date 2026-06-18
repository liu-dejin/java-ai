package cn.kis2.service.impl;

import cn.kis2.dao.UserDao;
import cn.kis2.pojo.User;
import cn.kis2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


// @Component // 当前类交给ioc容器管理
@Service
public class UserServiceImpl2 implements UserService {

    @Autowired // 运行时自动查找bean对象
    private UserDao userDao ;

    @Override
    public List<User> User() {
        // 调用dao获取数据
        List<String> lines = userDao.findAll();
        List<User> userList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String username = parts[1];
            String password = parts[2];
            String name = parts[3];
            Integer age = Integer.parseInt(parts[4]);
            LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id+200, username, password, name, age, updateTime);
        }).collect(Collectors.toList());
        return userList;
    }
}
