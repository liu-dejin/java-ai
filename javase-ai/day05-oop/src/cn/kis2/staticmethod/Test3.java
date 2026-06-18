package cn.kis2.staticmethod;

public class Test3 {
    static void main() {
        // 注册页面
        String code = VerifyCodeUtil.getCode(9);
        System.out.println(code);
    }
}
