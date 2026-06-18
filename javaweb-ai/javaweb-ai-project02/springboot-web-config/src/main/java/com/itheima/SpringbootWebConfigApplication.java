package com.itheima;

import com.example.EnableHeaderConfig;
import com.example.HeaderConfig;
import com.example.MyImportSelector;
import com.example.TokenParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


// 自动配置方案一 @Component+@ComponentScan(basePackages = {"com.example","com.itheima"})
// 方案二 @import(MyAutoConfiguration.class)

// @Import(TokenParser.class) // 普通类
// @Import(HeaderConfig.class) // 配置类
// 方案三
// @Import(MyImportSelector.class) // ImportSelector的实现类

// 方案四 封装到注解中 使用者直接调用

// @EnableHeaderConfig
@Import(HeaderConfig.class)
@SpringBootApplication // 默认扫描扫描启动类所在包及其子包
@ComponentScan(basePackages = {"com.example","com.itheima"}) //需要加上默认扫描的包
public class SpringbootWebConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebConfigApplication.class, args);
    }

}
