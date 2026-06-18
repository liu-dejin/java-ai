package cn.kis2.stringdemo;

public class Test2 {
    static void main() {

    }

    // 打印指定位数的验证码
    public static String getCode(int n) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code = "";
        for (int i = 0; i < n; i++) {
            int index = (int) (Math.random() * str.length());
            code += str.charAt(index);
        }
        return code;
    }
}
