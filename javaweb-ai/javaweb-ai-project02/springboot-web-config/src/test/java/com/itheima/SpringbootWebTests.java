package com.itheima;

import cn.hutool.core.io.FileUtil;
import com.example.HeaderParser;
import com.example.TokenParser;
import com.google.gson.Gson;
import com.itheima.controller.DeptController;
import com.itheima.pojo.Result;
import com.itheima.utils.AliyunOSSOperator;
import com.itheima.utils.AliyunOSSProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.io.File;

@SpringBootTest
class SpringbootWebTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;

    // @Autowired
    // private Gson gson;
    //
    // @Autowired
    // private TokenParser tokenParser;

    @Test
    public void testScope() {
        for (int i = 0; i < 1000; i++) {
            Object deptController = applicationContext.getBean("deptController");
            System.out.println(deptController);
        }
    }

    @Test
    public void testUpload() throws Exception {
        File file = new File("C:\\Users\\L\\Pictures\\1\\faviconV2.png");
        String url = aliyunOSSOperator.upload(FileUtil.readBytes(file), "1.png");
        System.out.println(url);
    }

    // @Test
    // public void testGson() {
    //     System.out.println(gson.toJson(Result.success("hello,Gson")));
    // }
    //
    //
    // @Test
    // public void testTokenParser(){
    //     tokenParser.parse();
    // }

    @Autowired
    private HeaderParser headerParser;

    @Test
    public void testHeaderParser(){
        headerParser.parse();
    }
}
