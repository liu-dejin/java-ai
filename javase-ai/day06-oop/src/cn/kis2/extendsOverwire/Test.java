package cn.kis2.extendsOverwire;

public class Test {
    static void main() {

    }
}

class Cat extends Animal {
    // 方法重写 子类重写一个方法名称必须一样
    // 1.访问权限 必须一致或者更宽
    // 2.返回值类型 必须一致或者更窄
    // 3.私有方法,静态方法不能重写

    // !!!! 声明不变,重新实现
    @Override // 方法重写的教研注解 方法名称和参数必须和被重写一样 否则报错 更安全
    public void cry() {
        System.out.println("miaow");
    }
}

class Animal {
    public void cry() {
        System.out.println("cry");
    }
}
