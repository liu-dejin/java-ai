package cn.kis2.demo1hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}'+"\n";
    }

    // 1.对象类实现Comparable接口 重写compareTo方法 制定比较规则

    // t2.compareTo(t1)
    // t2 this 比较者
    // t1 o 被比较者
    // 左边大于右边 返回正整数
    // 左边小于右边 返回负整数
    // 左边等于右边 返回0
    @Override
    public int compareTo(Teacher o) {
        // 按照年龄升序
        // if(this.getAge() > o.getAge()) return 1;
        // if(this.getAge() < o.getAge()) return -1;
        // return 1;

        return this.getAge()-o.getAge(); // 升序
    }
}
