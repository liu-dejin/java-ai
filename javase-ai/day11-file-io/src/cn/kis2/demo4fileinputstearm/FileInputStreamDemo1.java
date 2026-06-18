package cn.kis2.demo4fileinputstearm;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    static void main() throws Exception {
        // 读取文件
        // 1. 创建管道
        FileInputStream is = new FileInputStream("day11-file-io/src/cn/kis2/demo4fileinputstearm/2.txt");

        // 2. 读取字节
        // 记住每次读取的字节
        // int b;
        // while((b = is.read()) != -1) {
        //     System.out.print((char)b);
        // }

        // 每次读取一个字节性能较差，读取汉字输出会乱码

        // 读取多个
        // 定义一个字符数组 存每次读取的字节
        byte[] buffer = new byte[3];
        // 记录读取了多少字节pacman -Ss fish
        int len;
        while((len = is.read(buffer)) != -1) {
            String s = new String(buffer, 0, len);
            System.out.println(s);
        }

        // 每次读多个字节  读取汉字输出会乱码 存在截断汉字字节情况
        is.close();


    }
}
