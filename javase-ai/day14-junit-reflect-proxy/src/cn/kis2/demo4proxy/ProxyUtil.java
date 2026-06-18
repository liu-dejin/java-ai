package cn.kis2.demo4proxy;

import java.lang.reflect.Proxy;

// 创建代理对象的工具类
public class ProxyUtil {
    // 创建一个明星对象的代理对象

    /**
     * 在ProxyUtil只看首位，就是传入一个Star类的对象，返回一个代理人proxy
     匿名内部类只是规定代理人的具体行为（场地收钱、唤起跳舞），可以忽略
     总的来说就是，通过代理人工厂创建一个代理人，给proxy，这个代理人调用的唱歌方法会包含歌手唱歌，额外场地收钱
     */
    public static StarService createProxy(Star s) {
        /*
          参数一：用于执行用那个类加载器去加载生成的代理类
          参数二：代理类需要实现的接口   明星类实现了哪些接口 代理类就实现哪些接口
          参数三：如何去代理 代理要去做的事情
          返回值：代理对象
         */
        StarService proxy = (StarService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), s.getClass().getInterfaces(), (_, method, args) -> {
            // 声明代理对象要干的事情
            // 参数一 接收到代理对象本身（暂时不用）
            // 参数二 method 代表正在被代理的方法
            // 参数三 args 代表被代理的方法的参数
            String methodName = method.getName();
            if("sing".equals(methodName)){
                System.out.println("话筒，收钱20w");
            }else if ("dance".equals(methodName)){
                System.out.println("准备场地，收钱10w");
            }
            // 真正干活 真正的明星对象叫过来干活

            return method.invoke(s, args);
        });
        return proxy;
    }
}
