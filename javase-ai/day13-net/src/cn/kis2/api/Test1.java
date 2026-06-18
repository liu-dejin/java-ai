package cn.kis2.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test1 {
    static void main() {
        // jdk8之前 老方案 Date 获取此刻时间
        Date date = new Date();
        // System.out.println(date);

        // 格式化 simpleDateFormat 简单日期格式化 格式化日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        // System.out.println(str);

        System.out.println("年份：" + date.getYear() + 1900);

        // jdk8  之后的方案 localDate localTime localDateTime 获取此刻时间
        // 获取此刻日期时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());


        // 格式化 DateTimeFormater 时间日期格式化
        // 创建一个格式化对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss EEE a");

        // 格式化now对象的时间
        String result = dtf.format(now);
        System.out.println(result);

    }
}
