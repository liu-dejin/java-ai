package cn.kis2.interface1;

// 使用interface定义接口
public interface A {
    // JDK8之前：只能定义常量和抽象方法
    String SCHOOL_NAME = "张三";
    // public static final String SCHOOL_NAME = "张三"; // 可以省略 public static final

     void run();
    // public abstract void run(); 可以省略  public abstract
}
