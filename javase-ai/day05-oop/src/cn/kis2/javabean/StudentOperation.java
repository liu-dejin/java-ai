package cn.kis2.javabean;

public class StudentOperation {
    // 拿到要处理的学生对象
    private Student s;  // 记录将来要处理的学生对象 null

    public StudentOperation(Student s) {
        this.s = s;
    }

    // 提供方法 打印学生成绩的
    public void printScore() {
        System.out.println(s.getName() + "的总成绩是" + (
                s.getChines() + s.getEnglish() + s.getMath()
        ));
    }

    // 打印平均成绩
    public void printAvgScore() {
        System.out.println(s.getName() + "的平均成绩是" + (s.getChines() + s.getEnglish() + s.getMath()) / 3);
    }
}

