package cn.kis2.demo2redlect;

public class ReflectDemo4 {
    static void main() throws Exception {
        // 做框架的基本技术
        Dog d = new Dog("旺财", 22);
        SaveObjFrame.savaObj(d);
        Teacher t = new Teacher("李老师", 22, "男", "打球", "10000", "1班");
        SaveObjFrame.savaObj(t);

        Student s = new Student("张三", 22);
        SaveObjFrame.savaObj(s);
    }
}
