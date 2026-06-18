package cn.kis2.interface3;

public class Test {
    static void main() {
        // 1.定义学生类 创建学生对象
        // 2.准备学生数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 90);
        allStudents[1] = new Student("赵敏", '女', 80);
        allStudents[2] = new Student("张无忌", '男', 70);
        allStudents[3] = new Student("周芷若", '女', 60);
        allStudents[4] = new Student("金毛狮王", '男', 50);
        allStudents[5] = new Student("小昭", '女', 40);
        allStudents[6] = new Student("吴九", '男', 30);
        allStudents[7] = new Student("郑十", '女', 20);
        allStudents[8] = new Student("小七", '男', 10);
        allStudents[9] = new Student("小八", '女', 0);


        // 3.两套方案切换     定义接口
        // A 必须打印全部学生信息 打印平均分
        // 第一套实现    实现打印学生信息，实现打印平均分。
        // 第二套实现    实现打印学生信息（男女人数），实现打印平均分（去掉最高分和最低分）。
        ClassDataInter cdi = new ClassDataInterImpl2(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAvgScore();
    }
}
