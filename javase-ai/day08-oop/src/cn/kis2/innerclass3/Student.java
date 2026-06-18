package cn.kis2.innerclass3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student  {
    // 姓名,年龄,身高,性别
    private String name;
    private int age;
    private int height;
    private char sex;

}
