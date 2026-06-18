package cn.kis2.demo1exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    static void main() {
        // 认识异常
        show();
        try {
            // 出现异常呗catch拦截
            show2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    // 定义一个方法认识运行时异常
    static void show() {
        // 运行时异常 编译不报错 继承自 RuntimeException
        int[] arr = {1, 2, 3};
        // System.out.println(arr[3]); //ArrayIndexOutOfBoundsException 异常出现 程序报错停止

        // 空指针异常
        String str = null;
        // System.out.println(str.length()); // NullPointerException
    }

    static void show2() throws Exception {
        // 编译异常 编码阶段错误  必须处理 否则编译不通过
        String s = "2026-05-16 16:29:26";
        // 字符串时间解析为时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        Date date = sdf.parse(s);  // 编译时异常 提醒程序员很容易出错
        System.out.println(date);

        FileInputStream f = new FileInputStream("D:/");
    }
}
