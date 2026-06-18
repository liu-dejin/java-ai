package cn.kis2.extendsOverwire;

public class Test2 {
    static void main() {
        // 方法重写的应用场景 子类重写object的toString方法
        Student s = new Student("xw", '女', 18);
        // System.out.println(s.toString()); // cn.kis2.extendsOverwire.Student@23fc625e 地址
        System.out.println(s); // cn.kis2.extendsOverwire.Student@23fc625e 地址

        // 1.直接输出对象 会默认调用toString方法 返回对象的地址信息 可以省略不写
        // 2.输出对象的地址无意义 更希望输出对象值 看对象的内容信息,所以子类需要重写toString方法 以便以后输出对象就近调用子类的toString方法 返回对象的内容

    }
}

class Student{
    private String name;
    private char sex;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
       this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
