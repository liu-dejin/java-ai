package cn.kis2.controller;

import cn.kis2.pojo.User;
import cn.kis2.service.UserService;
import cn.kis2.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;


/*
 * 用户Controller
 */
@RestController  //@ResponseBody 将Controller返回值作为返回体 直接响应
public class UserController {

    /*
     方式一 字段注入   方便   隐藏了类的依赖关系 破坏封装性
     @Autowired
     private UserService userService;
    */

    /*
     方式二 构造器注入  清晰依赖关系   繁琐 臃肿
     private final UserService userService;
     // @Autowired 如果当前类只存在一个构造函数 可以省略autoWired
     public UserController(UserService userService) {
         this.userService = userService;
     }
    */

    // 方式三 set方法注入  清晰依赖关系 编码繁琐
    private UserService userService;
    // @Qualifier("userServiceImpl2")
    // @Autowired

    @Resource(name = "userServiceImpl2")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<User> list() throws Exception {
        return userService.User();

//         1.加载并读取user.txt文件
//         FileInputStream in = new FileInputStream("C:\\develop\\java_project\\javaweb-ai\\springboot-web-01\\src\\main\\resources\\user.txt");
//         InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
//         ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
//
//         2.解析用户信息，封装成User对象 List集合
//         List<User> userList = lines.stream().map(line -> {
//             String[] parts = line.split(",");
//             Integer id = Integer.parseInt(parts[0]);
//             String username = parts[1];
//             String password = parts[2];
//             String name = parts[3];
//             Integer age = Integer.parseInt(parts[4]);
//             LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//             return new User(id, username, password, name, age, updateTime);
//         }).collect(Collectors.toList());// 16 之后 tOList() 方法被废弃，改为 toList()
//         3.返回给前端 JSON
//         return userList;

    }
}
