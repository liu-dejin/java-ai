package cn.kis2.demo11bufferedwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("day11-file-io/src/cn/kis2/demo11bufferedwriter/csb.txt"));
              BufferedWriter bf = new BufferedWriter(new FileWriter("day11-file-io/src/cn/kis2/demo11bufferedwriter/csd111.txt"))) {
            // List集合存储每段内容
            List<String> data = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            // 给集合每段内容首字母排序
            Collections.sort(data);
            System.out.println(data);

            // 遍历集合 写到文件
            for (String s : data) {
                bf.write(s);
                bf.newLine();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
