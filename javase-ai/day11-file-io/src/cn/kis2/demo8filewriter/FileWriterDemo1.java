package cn.kis2.demo8filewriter;

import java.io.FileWriter;

public class FileWriterDemo1 {
    static void main() {
        // 创建文件字符输出流 制定写出的目的地
        try (FileWriter fw = new FileWriter("day11-file-io/src/cn/kis2/demo8filewriter/aaa")) {
            // 写字符
            fw.write('a');
            fw.write(97);
            fw.write('金');
            // 写字符串
            fw.write("hello world");

            fw.write("\r\n");

            // 写字符数组
            char[] chs = "java".toCharArray();
            fw.write(chs);
            fw.write(chs,1,2);
            fw.write("\r\n");

            // 写字符串的一部分
            fw.write("hello world",1,5);

            // fw.flush(); // 刷新缓冲区 将缓冲区全部数据写出去
            // // 刷新后可以继续使用
            // fw.close(); // 关闭流 无法继续使用了
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
