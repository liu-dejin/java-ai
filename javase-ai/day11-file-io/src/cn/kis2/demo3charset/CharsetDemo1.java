package cn.kis2.demo3charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharsetDemo1 {
    static void main() throws UnsupportedEncodingException {
        // 写程序实现编码解码
        String s = "我爱你";
        byte[] bytes = s.getBytes(); // 指定gbk
        System.out.println(bytes.length);  // 一个汉字3个字节
        System.out.println(Arrays.toString(bytes));

        // 解码
        String s2 = new String(bytes); // 不传默认使用utf-8解码
        System.out.println(s2);
    }

}
