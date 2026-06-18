package cn.kis2.interface2;


interface Driver {
}


interface BoyFriend {
}

public class Test {
    static void main() {
        // 接口的好处
        // 弥补类单继承的不足,可以让类拥有更多角色,类的功能更强大
        People s = new Student();
        Driver d = new Student();
        // 面向接口编程 解耦和
        Driver s1 = new Student();
        BoyFriend t1 = new Teacher();
    }
}

class People {
}

class Student extends People implements Driver, BoyFriend {

}

class Teacher implements Driver, BoyFriend {

}
