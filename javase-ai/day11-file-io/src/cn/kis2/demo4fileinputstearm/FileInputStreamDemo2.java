package cn.kis2.demo4fileinputstearm;

import java.io.FileInputStream;

public class FileInputStreamDemo2 {
    static void main() throws Exception {
        // 读取文件
        // 1. 创建管道
        FileInputStream is = new FileInputStream("day11-file-io/src/cn/kis2/demo4fileinputstearm/3.txt");
        // 一次读完全部
        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));

        is.close();
    }
}
