package cn.kis2.demo10bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferReaderDemo1 {
    static void main() {
        // 字符串缓冲流
        try (
                Reader fr = new FileReader("day11-file-io/src/cn/kis2/demo7fileReader/aaa");
                // 创建缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);
        ) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
