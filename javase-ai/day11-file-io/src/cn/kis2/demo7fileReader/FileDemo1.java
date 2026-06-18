package cn.kis2.demo7fileReader;

import java.io.FileReader;
import java.io.Reader;

public class FileDemo1 {
    static void main() {
        // 创建文件字符输入流
        try (Reader fr = new FileReader("day11-file-io/src/cn/kis2/demo7fileReader/aaa")) {
            // 定义一个字符数组 每次读多个字符
            char[] chs = new char[3];
            int len; // 每次读了几个字符
            while ((len = fr.read(chs)) != -1) {
                String str = new String(chs, 0, len);
                System.out.println(str);
            }

            // 文件字符输入流每次读取多个字符 性能较好 可以读中文
            // 按照字符读 不会出现乱码
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
