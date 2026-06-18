package cn.kis2.staticmethod;

public final class VerifyCodeUtil {
    // 工具类 静态方法
    // 类名调用 节约内存

    // 工具类没有创建对象的必要 私有化构造器
    private VerifyCodeUtil(){}
    public static String getCode(int n){
        // 指定位数验证码

        String code = "";
        for (int i = 0; i < n; i++) {
            int type = (int) (Math.random() * 3);
            switch (type){
                case 0:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    int num1 = (int) (Math.random() * 26);
                    char ch = (char) (65 + num1); //得到大写字母区别 转成字符
                    code += ch;
                    break;
                case 2:
                    int num2 = (int) (Math.random() * 26);
                    char ch2 = (char) (97 + num2); //得到大写字母区别 转成字符
                    code += ch2;
                    break;
            }

        }
        return code;


    }
}
