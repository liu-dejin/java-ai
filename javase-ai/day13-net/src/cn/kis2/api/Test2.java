package cn.kis2.api;

public class Test2 {
    static void main() {
        // 高效拼接
        // + 拼接大量效率低下
        // String对象是不可变对象 不断堆积 修改数据性能差
        // String s = "";
        // for (int i = 0; i < 1000000; i++) {
        //     s += "abc";
        // }
        // System.out.println(s);

        StringBuilder sb = new StringBuilder(); // 可变内容容器
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);

        // StringBuilder只是拼接的手段 还是要恢复为字符串
        String sass = sb.toString();
        System.out.println(sass);

        // 链式编程
        StringBuilder sb2 = new StringBuilder();
        sb2.append("abc").append("def").append("ghi");
        System.out.println(sb2);

    }
}
