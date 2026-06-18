package cn.kis2.demo1exception;

public class ExceptionDemo3 {
    static void main()  {
        // 自定义异常
        try {
            saveAge(300);
            System.out.println("成功");
        } catch (IllegalAgeException e) {
            e.printStackTrace();
            System.out.println("失败");
        }
    }
    // 年龄小于1岁大于200岁 就是一个非法异常
    public static void saveAge(int age) throws IllegalAgeException {
        if(age<1||age>200){
            throw new IllegalAgeException("年龄非法 age 不能低于1岁不能高于200岁");
        }else {
            System.out.println("保存年龄成功");
        }
    }
}
