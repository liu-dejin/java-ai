package cn.kis2.extendsconstructor;

public class Test3 {
    static void main() {
        // this(...) 调用兄弟构造器
        Students s1 = new Students("张三", 18, '男');
        System.out.println(s1);
        Students s2 = new Students("赵敏", 14, '女');
        System.out.println(s2);
    }
}
