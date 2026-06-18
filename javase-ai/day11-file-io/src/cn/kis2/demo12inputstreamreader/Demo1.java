package cn.kis2.demo12inputstreamreader;

import java.io.*;

public class Demo1 {
    static void main() {
        // 不同编码读取乱码的问题
        // 代码utf-8   文件utf-8   读取正常
        // 代码utf-8   文件gbk   读取中文乱码  数字字母不乱码
        // 代码gbk   文件gbk   读取正常
        // inputStreamReader
        try (InputStream is = new FileInputStream("day11-file-io/src/cn/kis2/aaa"); Reader isr = new InputStreamReader(is, "GBK");


             // 创建缓冲字符输入流
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
