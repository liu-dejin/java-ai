package cn.kis2.demo1file;

import java.io.File;
import java.util.Arrays;

public class FileDemo2 {
    static void main() {
         // 遍历一级文件对象的操作
        // 文件或位置不存在 返回null  没有权限也是null
        File dir = new File("xxx");
        System.out.println(dir.exists());
        System.out.println(dir.listFiles());

        // 文件夹为空 返回 []
        File dir2 = new File("C:\\Users\\L\\Pictures\\驾照 - 副本");
        System.out.println(Arrays.toString(dir2.listFiles()));
    }
}
