package cn.kis2.interface3;

public class ClassDataInterImpl2 implements ClassDataInter {
    private Student[] students;

    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }

    // 实现打印学生信息（男女人数），
    @Override
    public void printAllStudentInfos() {
        int manCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + s.getSex() + s.getScore());
            if (s.getSex() == '男') {
                manCount++;
            }
        }
        System.out.println("男女人数分别是" + manCount + "和" + (students.length - manCount));
    }

    @Override
    public void printAvgScore() {
        // 实现打印平均分（去掉最高分和最低分）。
        System.out.println("平均分如下");
        Student s1 = students[0];
        double sum = s1.getScore();
        double max = s1.getScore();
        double min = s1.getScore();

        for (int i = 1; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
            if (s.getScore() > max) {
                max = s.getScore();
            }
            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("最高分" + max + "最低分" + min);
        System.out.println("平均分" + (sum - max - min) / (students.length - 2));

    }
}
