package cn.kis2.innerclass;

public class InnerClassDemo1 {
    static void main() {
        // 成员内部类
        // 成员内部类创建对象
        Outer.Inner oi = new Outer().new Inner();
        oi.setName("张三");
        oi.show();

        // 成员内部类访问外部类成员
        // 1.可以直接访问外部类的静态成员,也可以访问外部类的实例成员
        // 2.成员内部类的实例方法中,可以直接拿到当前寄生的外部类对象 外部类.this
        People.Heart heart = new People().new Heart();
        heart.beat();
    }
}

class People {
    private int heartBeat = 120;
    class Heart {
        private int heartBeat = 100;
        public void beat() {
            int heartBeat = 80;
            System.out.println(heartBeat);
            System.out.println(this.heartBeat);
            System.out.println(People.this.heartBeat);
        }
    }
}
