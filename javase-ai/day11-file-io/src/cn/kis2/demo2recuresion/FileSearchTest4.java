package cn.kis2.demo2recuresion;

import java.io.File;
import java.io.IOException;

public class FileSearchTest4 {
    static void main() {
        // 定位目录
        try {
            File dir = new File("C:/");
            searchFile(dir,"HBuilderX.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchFile(File dir, String fileName) throws IOException {
        if(dir==null|| !dir.exists()|| dir.isFile()) {
            return;
        };
        // 获取一级目录的
        File[] files = dir.listFiles();

        // 判断当前目录下是否存在一级文件对象 存在才能遍历
        if(files!=null && files.length>0) {
            // 遍历一级文件对象
            for(File file:files) {
                if(file.isFile()) {
                    // 获取文件名
                    String name = file.getName();
                    if(name.contains(fileName)) {
                        System.out.println(file.getAbsolutePath());
                        Runtime r = Runtime.getRuntime();
                        r.exec(file.getAbsolutePath());
                    }
                } else {
                    // 递归调用
                    searchFile(file,fileName);
                }
            }
        }
    }
}
