package cn.kis2.demo11bufferedwriter;

import java.io.*;

public class BufferWriterDemo1 {
    static void main() {

        // 缓冲字符输出流 提高写入效率 避免频繁刷新缓冲区

        // 创建文件字符输出流 制定写出的目的地
        try (FileWriter fw = new FileWriter("day11-file-io/src/cn/kis2/demo8filewriter/aaa", true); BufferedWriter bw = new BufferedWriter(fw)) {
            // 写字符
            bw.write('a');
            bw.write(97);
            bw.write('金');
            // 写字符串
            bw.write("hello world");


            bw.newLine(); // 换行

            // 写字符数组
            char[] chs = "java".toCharArray();
            bw.write(chs);
            bw.write(chs, 1, 2);

            bw.newLine(); // 换行

            // 写字符串的一部分
            bw.write("hello world", 1, 5);

            // fw.flush(); // 刷新缓冲区 将缓冲区全部数据写出去
            // // 刷新后可以继续使用
            // fw.close(); // 关闭流 无法继续使用了
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
