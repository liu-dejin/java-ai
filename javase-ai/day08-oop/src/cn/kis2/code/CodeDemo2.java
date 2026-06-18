package cn.kis2.code;

public class CodeDemo2 {
    private String name;
    private String[] direction = new String[4];

    // 无static修饰 属于对象 每次创建对象时 优先执行一次
    // 初始化对象的实例资源
    {
        System.out.println("实例代码块");
        name = "张三";
        direction[0] = "东";
        direction[1] = "南";
        direction[2] = "西";
        direction[3] = "北";
    }

    static void main() {
        // 实例代码库
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
