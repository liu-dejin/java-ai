package cn.kis2.demo2redlect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String name;
    private int age;
    private String gender;
    private String hobby;
    private String salary;
    private String className;
}
