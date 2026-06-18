package cn.kis2.innerclass2;

public class Outer {
    public static String name = "张三";
    private int age;
    // 静态内部类 外部类本身持有
    public static class Inner {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println("静态内部类");
            System.out.println(name);
            // System.out.println(age); 静态内部类不可以直接访问外部类的实例成员
        }
    }
}
