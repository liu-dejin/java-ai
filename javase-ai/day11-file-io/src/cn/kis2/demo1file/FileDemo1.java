package cn.kis2.demo1file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    static void main() throws IOException {
        // 1.创建file信息
        // 创建文件或文件夹 对文件增删改查
        // File f1 = new File("C:\\Users\\L\\Pictures\\20241025n447eh.webp");
        File f2 = new File("C:/Users/L/Pictures/20241025n447eh.webp");
        System.out.println(f2.length()); // 字节数
        System.out.println(f2.getName());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());

        // 2.相对路径定位文件对象

        // 绝对路径 带盘符
        // 相对路径 项目下的文件 idea  工程目录下
        File f3 = new File("day11-file-io/src/cn/kis2/demo1file/jin.txt");
        System.out.println(f3.length());

        // 3.创建对象代表不存在的文件路径
        // File f4 = new File("xxxx");
        // System.out.println(f4.exists());
        // System.out.println(f4.createNewFile());
        //
        // // 4.创建对象代表不存在的文件夹  只能创建一级
        // File f5 = new File("yyyy");
        // System.out.println(f5.exists());
        // System.out.println(f5.mkdir());
        // System.out.println(f5.mkdirs()); // 创建多级

        // 5.创建一个存在的文件 然后删除他
        new File("xxxx").delete();
        // 创建一个存在的文件夹 然后删除他 只能删除空文件夹
        new File("yyyy").delete();

        // 获取文件夹全部一级文件名
        File f6 = new File("C:\\Users\\L\\Pictures\\驾照 - 副本");
        String[] names = f6.list();
        // System.out.println(names);

        // 获取文件夹全部一级文件对象
        File[] files = f6.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile()); // 绝对路径
            file.delete();
        }
    }
}
