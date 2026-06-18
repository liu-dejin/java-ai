package cn.kis2.demo1exception;

public class ExceptionDemo4 {
    static void main()  {

        try {
            saveAge(300);
            System.out.println("成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败了");
        }
    }
    // 年龄小于1岁大于200岁 就是一个非法异常
    public static void saveAge(int age) {
        if(age<1||age>200){
            throw new IllegalAgeRuntimeException("年龄非法 age 不能低于1岁不能高于200岁");
        }else {
            System.out.println("保存年龄成功");
        }
    }
}
