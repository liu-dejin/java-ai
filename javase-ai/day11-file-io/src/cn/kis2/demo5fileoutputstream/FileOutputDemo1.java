package cn.kis2.demo5fileoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputDemo1 {
    static void main() throws Exception {
        // 创建字节输出流管道
        // OutputStream os = new FileOutputStream("day11-file-io/src/cn/kis2/demo5fileoutputstream/outtest.txt");
        OutputStream os = new FileOutputStream("day11-file-io/src/cn/kis2/demo5fileoutputstream/outtest.txt"); // 开启追加数据

        // 写入数据
        os.write(97);
        os.write('b');
        os.write("\r\n".getBytes());
        // os.write("刘"); // 字符串会乱码

        // 写一个字节数组 getBytes()
        byte[] bytes = "我爱你中国".getBytes();

        // 从0 开始 写三个字节  一般的汉字占三个字节 utf-8
        os.write(bytes, 0, 3);

        os.close();

     }
}
