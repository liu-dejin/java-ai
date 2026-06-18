package cn.kis2.extends4;

public class Test {
    static void main() {
        // 继承的特点
        A a = new A();
        // a.equals();
    }
}
// 1.单继承 不支持多继承 支持多层继承
class A {

}
class B extends A {}
class C extends B {}
// 2.java 祖宗类 object 默认继承object 要么间接继承object

