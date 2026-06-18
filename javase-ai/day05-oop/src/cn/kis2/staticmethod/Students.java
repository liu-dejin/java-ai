package cn.kis2.staticmethod;

public class Students {
    private static double score;

    public static void print(){
        // 静态方法
        System.out.println("hello");

    }
    // 实例方法
    public void printPass(){
        System.out.println(score>60?"及格":"不及格"); // 实例方法，输出结果取决于score的值
    }
    public void setScore(double score){
        this.score = score;
    }
}
