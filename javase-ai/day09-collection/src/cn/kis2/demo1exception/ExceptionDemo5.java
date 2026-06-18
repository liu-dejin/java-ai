package cn.kis2.demo1exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    static void main() {
        // 异常处理方式1 底层异常抛出给最外层
        System.out.println("程序开始");
        try {
            show();
            System.out.println("成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败了");
        }
        System.out.println("程序结束");
    }
    static void show() throws Exception{
        // 编译异常 编码阶段错误  必须处理 否则编译不通过
        String s = "2026-05-16 16:29:26";
        // 字符串时间解析为时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        Date date = sdf.parse(s);  // 编译时异常 提醒程序员很容易出错
        System.out.println(date);

        FileInputStream f = new FileInputStream("D:/");
    }
}
