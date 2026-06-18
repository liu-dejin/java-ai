package cn.kis2.demo1hashset;

import java.util.Objects;

public class Students {
    private String name;
    private int age;
    private String Address;
    private String Phone;

    public Students() {
    }

    public Students(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        Address = address;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    // 内容一致结果为true
    // s3.equals(s1)
    @Override
    public boolean equals(Object o) {
        // 如果是自己给自己比 直接返回true
        if(this==o) return true;
        // 如果o为空或者不是Students 直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 比较内容是否一致
        Students students = (Students) o;
        return age == students.age && Objects.equals(name, students.name) && Objects.equals(Address, students.Address) && Objects.equals(Phone, students.Phone);
    }

    @Override
    public int hashCode() {
        // 保证了内容一样。返回的哈希值一定是一样的
        return Objects.hash(name, age, Address, Phone);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}'+"\n";
    }
}
