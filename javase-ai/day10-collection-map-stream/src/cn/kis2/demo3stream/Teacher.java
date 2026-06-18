package cn.kis2.demo3stream;

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


    @Override
    public int compareTo(Teacher o) {
        // 按照年龄升序
        // if(this.getAge() > o.getAge()) return 1;
        // if(this.getAge() < o.getAge()) return -1;
        // return 1;

        return this.getAge()-o.getAge(); // 升序
    }
}
