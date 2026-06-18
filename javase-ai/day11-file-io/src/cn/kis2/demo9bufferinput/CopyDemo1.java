package cn.kis2.demo9bufferinput;




import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CopyDemo1 {
    static void main() {
       // 缓存流
        // C:\Users\L\Pictures\faviconV2.png => C:\Users\L\Pictures\1\faviconV2.png (必须带上文件名可以不重名）
        copyFile("C:\\Users\\L\\Pictures\\faviconV2.png", "C:\\Users\\L\\Pictures\\1\\faviconV2.png");
    }

    // 复制文件
    public static void copyFile(String src, String dest) {

        // try-with-resources
        try (
                // 只能放置资源对象 用完后自动调用close()方法关闭
                FileInputStream fis = new FileInputStream(src);
                // 低级的字节输入流包装为缓冲流提高效率
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(dest);
                // 低级的字节输出流包装为缓冲流提高效率
                BufferedOutputStream bos = new BufferedOutputStream(fos);
               ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
