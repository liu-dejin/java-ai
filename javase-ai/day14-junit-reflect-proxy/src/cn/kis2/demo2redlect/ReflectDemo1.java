package cn.kis2.demo2redlect;

public class ReflectDemo1 {
    static void main() throws ClassNotFoundException {
        // 拿到class本身

        // 方法1
        Class c1 = Student.class;
        System.out.println(c1);

        // 2.方法2
        Class c2 = Class.forName("cn.kis2.demo2redlect.Student");
        System.out.println(c2);

        // 方法3
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);

    }
}
