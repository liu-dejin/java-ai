package cn.kis2.demo11bufferedwriter;

import java.io.*;
import java.util.stream.IntStream;

public class TimeTest {
    private static final String PATH = "C:\\Users\\L\\Videos\\1111.mp4";
    private static final String DestPATH = "C:\\Users\\L\\Videos\\L\\1111.mp4";

    static void main() {
        // copyFile1(); // 不推荐使用

        // 字节流按字节数组处理视频耗时：0.602s
        // 缓冲字节流处理视频耗时：2.884s
        // 缓冲字节数组处理视频耗时：0.168s
        copyFile2();
        copyFile3();
        copyFile4();

    }


    private static void copyFile4() {
        // 缓冲字节数组处理视频

        long start = System.currentTimeMillis(); // 此刻时间戳
        try (InputStream fis = new BufferedInputStream(new FileInputStream(PATH)); OutputStream fos = new BufferedOutputStream(new FileOutputStream(DestPATH))) {
            byte[] bytes = new byte[1024*512];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            // 结束时间
            long end = System.currentTimeMillis();
            System.out.println("缓冲字节数组处理视频耗时：" + (end - start) / 1000.0 + "s");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void copyFile3() {
        // 缓冲字节流处理视频
        long start = System.currentTimeMillis(); // 此刻时间戳
        try (InputStream fis = new BufferedInputStream(new FileInputStream(PATH)); OutputStream fos = new BufferedOutputStream(new FileOutputStream(DestPATH))) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            // 结束时间
            long end = System.currentTimeMillis();
            System.out.println("缓冲字节流处理视频耗时：" + (end - start) / 1000.0 + "s");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void copyFile2() {

        // 字节流按字节数组处理视频
        long start = System.currentTimeMillis(); // 此刻时间戳

        byte[] bytes = new byte[1024*512];
        try (FileInputStream fis = new FileInputStream(PATH); FileOutputStream fos = new FileOutputStream(DestPATH)) {
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            // 结束时间
            long end = System.currentTimeMillis();
            System.out.println("字节流按字节数组处理视频耗时：" + (end - start) / 1000.0 + "s");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void copyFile1() {
        // 字节流处理视频

        // 拿系统当前时间
        long start = System.currentTimeMillis(); // 此刻时间戳
        try (FileInputStream fis = new FileInputStream(PATH); FileOutputStream fos = new FileOutputStream(DestPATH)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            // 结束时间
            long end = System.currentTimeMillis();
            System.out.println("字节流处理视频耗时：" + (end - start) / 1000.0 + "s");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
