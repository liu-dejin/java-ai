package cn.kis2.demo3genericity;

public class GenericDemo3 {
    static void main() {
        // 泛型接口
        // 对学生和老师都要增删改查
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.delete(new Student());
        studentData.update(new Student());
        studentData.query(1);
    }
}
