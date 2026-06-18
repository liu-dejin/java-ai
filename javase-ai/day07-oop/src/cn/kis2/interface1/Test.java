package cn.kis2.interface1;

public class Test {
    static void main() {
        // 接口
        System.out.println(A.SCHOOL_NAME);

        // 接口不能创建对象
        // new A().run(); 报错

        // 接口被类实现
        C c = new C();
        c.run();
        c.play();
        System.out.println(c.go());;
    }
}
// C实现类同时实现了多个接口
// 实现类实现多个接口 必须重写全部抽象方法 否则定义为抽象类
class C implements A, B {

    @Override
    public void run() {

    }

    @Override
    public void play() {

    }

    @Override
    public String go() {
        return "C重写run";
    }
}
