package cn.kis2.demo6copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo1 {
    static void main() {
        // 使用字节流完成复制
        // C:\Users\L\Pictures\faviconV2.png => C:\Users\L\Pictures\1\faviconV2.png (必须带上文件名可以不重名）
        copyFile("C:\\Users\\L\\Pictures\\faviconV2.png", "C:\\Users\\L\\Pictures\\1\\faviconV2.png");
    }

    // 复制文件
    public static void copyFile(String src, String dest)  {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
