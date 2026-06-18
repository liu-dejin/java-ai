package cn.kis2.innerclass3;

interface Swim {
    void swimming();
}

public class Test2 {
    static void main() {
        // 匿名内部类使用形式 作为一个对象参数传输给方法
        // 需求: 学生老师都要参加游泳比赛
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生游泳贼快");
            }
        };
        start(s1);
        System.out.println("=======================================================");
        start(() -> System.out.println("老师游泳贼快"));
    }

    // 设计一个方法,可以接受老师和学生开始比赛
    public static void start(Swim s) {
        System.out.println("开始游泳");
        s.swimming();
        System.out.println("结束游泳");
    }
}

// class Student implements Swim {
//     @Override
//     public void swimming() {
//         System.out.println("学生游泳");
//     }
// }
//
// class Teacher implements Swim {
//     @Override
//     public void swimming() {
//         System.out.println("老师游泳");
//     }
// }
