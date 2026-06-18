package com.example;

import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeaderConfig {

    @Bean
    // @ConditionalOnClass(name = "io.jsonwebtoken.Jwts") // 如果类路径下存在io.jsonwebtoken.Jwts，则创建HeaderParser
    // @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "myname",havingValue = "itheima")
    public HeaderParser headerParser(){
        return new HeaderParser();
    }

    @Bean
    public HeaderGenerator headerGenerator(){
        return new HeaderGenerator();
    }
}
