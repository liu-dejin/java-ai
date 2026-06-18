package cn.kis2.demo4proxy;


public class Test {
    static void main() {
        // 1. 准备明星对象
        Star star = new Star("章若楠");
        // 2.创建一个专属的代理对象
        StarService proxy = ProxyUtil.createProxy(star);
        proxy.sing("你好");
        System.out.println(proxy.dance());
    }
}
