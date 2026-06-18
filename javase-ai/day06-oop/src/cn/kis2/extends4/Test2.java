package cn.kis2.extends4;

public class Test2 {
    // 3.在子类访问其他成员 变量和方法 依照就近原则

    static void main() {
        Zi zi = new Zi();

        zi.show();
    }
}

class Fn {
    String name = "fn的name";

    public void run() {
        System.out.println("Fn的run");
    }
}

class Zi extends Fn {
    String name = "zi的name";

    public void show() {
        String name = "show的name";

        System.out.println(name); // show的name
        System.out.println(this.name);  // zi的name
        System.out.println(super.name); // fn的name
        run();
        super.run();
        // go(); 子类父类都没有,报错
    }

    public void run() {
        System.out.println("Zi的run");
    }
}


