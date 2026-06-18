package cn.kis2.innerclass;

public class Outer {
    public static String SchoolName = "KIS2";
    public static void test(){}

    private int age;
    private void run(){}
    // 成员内部类 无static修饰 属于外部内对象持有
    public class Inner {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // 构造器
        public Inner() {
            System.out.println("成员内部类构造器");
        }
        public Inner(String name) {
            this.name = name;
        }
        public void show() {
            System.out.println("成员内部类");
            System.out.println(SchoolName);
            test();
            // 也可以访问外部类的实例成员
            System.out.println(age);
            run();
            System.out.println(this); // 自己的对象
            System.out.println(Outer.this); // 外部类的对象
        }
    }
}
