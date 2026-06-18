package cn.kis2.interface4;

public interface A {
    // 1.默认方法
    // 使用default修饰 默认public修饰可省略
    default void go(){
        System.out.println("go方法执行了");
        run();
    }
    // 2.私有方法(jdk9才有) 接口中的方法才可以调用
    private void run(){
        System.out.println("run方法执行了");
    }
    // 3.静态方法 默认public修饰可忽略 只能使用接口名调用
    static void show(){
        System.out.println("show执行了");
    }
}
