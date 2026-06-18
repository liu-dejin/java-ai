package cn.kis2.demo5proxy2;

import java.util.Arrays;

public class Test {
    static void main() throws Exception {
        // 1、创建用户业务对象。
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());

        // 2、调用用户业务的功能。
        userService.login("admin", "123456");

        userService.deleteUsers();

        String[] names = userService.selectUsers();
        System.out.println("查询到的用户是：" + Arrays.toString(names));

        String[] names2 = userService.selectUsers2();
        System.out.println("查询到的用户是：" + Arrays.toString(names2));
    }
}
