package cn.kis2.innerclass3;

public class Test {
    // 匿名内部类
    static void main() {
        // 匿名内部类 外部类名$编号.class
        // 匿名内部类本质是一个子类 同时立即构建一个对象 更方便创建一个子类对象
        Animal a = new Animal(){
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}

// class Cat extends Animal {
//     @Override
//     public void cry() {
//         System.out.println("喵喵喵");
//     }
// }


