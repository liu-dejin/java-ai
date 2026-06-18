package cn.kis2.demo6copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    static void main() {
        // 使用字节流完成复制
        // C:\Users\L\Pictures\faviconV2.png => C:\Users\L\Pictures\1\faviconV2.png (必须带上文件名可以不重名）
        copyFile("C:\\Users\\L\\Pictures\\faviconV2.png", "C:\\Users\\L\\Pictures\\1\\faviconV2.png");
    }

    // 复制文件
    public static void copyFile(String src, String dest) {

        // try-with-resources
        try (
                // 只能放置资源对象 用完后自动调用close()方法关闭
                FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream(dest);
                MyConn conn = new MyConn()) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyConn implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("金花的资源关闭了");

    }}
