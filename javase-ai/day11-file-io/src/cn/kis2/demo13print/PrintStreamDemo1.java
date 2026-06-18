package cn.kis2.demo13print;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    static void main() {
        try (
                // PrintStream p = new PrintStream("day11-file-io/src/cn/kis2/test.txt")
                PrintStream p = new PrintStream(new FileOutputStream("day11-file-io/src/cn/kis2/test.txt", true))
        ) {
            p.println("hello world");
            p.println("a");
            p.println(123);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
