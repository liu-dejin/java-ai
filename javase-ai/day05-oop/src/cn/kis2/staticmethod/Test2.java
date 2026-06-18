package cn.kis2.staticmethod;

public class Test2 {
    static void main() {
        // 登录页面
        String code = VerifyCodeUtil.getCode(5);
        System.out.println(code);

        // new VerifyCodeUtil();

        Math.random(); // 工具类
    }

}
