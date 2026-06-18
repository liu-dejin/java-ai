package cn.kis2.interface4;

public class Test {
    // 接口JDK8新增的三种方法
    static void main() {
        AImp a = new AImp();
        a.go();
        A.show();
    }
}
class AImp implements A { }
