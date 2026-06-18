package cn.kis2.demo2genericity;


public class GenericDemo2 {
    static void main() {
        // 重写ArrayList 学会自定义泛型类
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hello");
        list.add("111");
        // list.add(222)
        System.out.println(list);
    }

}
