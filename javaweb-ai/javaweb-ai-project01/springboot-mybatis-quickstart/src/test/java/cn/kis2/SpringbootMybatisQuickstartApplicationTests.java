package cn.kis2;

import cn.kis2.mapper.UserMapper;
import cn.kis2.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest // springboot 单元测试注解 当前测试类的测试方法运行 会启动springboot项目
class SpringbootMybatisQuickstartApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestFindAll(){
        List<User> userlist = userMapper.findAll();
        userlist.forEach(System.out::println);

    }
    @Test
    public void TestDeleteById(){
        Integer i = userMapper.deleteById(4);
        System.out.println(i+"条数据被影响");
    }
    @Test
    public void TestInsert(){
        User user = new User(null, "1", "123456", "1", 20);
        userMapper.insert(user);
    }
    @Test
    public void TestUpdate(){
        User user = new User(1,"zhouyu","123456","周雨",20);
        userMapper.update(user);
    }
    @Test
    public void findByUsernameAndPasswordTest(){
        User user = userMapper.findByUsernameAndPassword("zhouyu", "123456");
        System.out.println(user);

    }
}
