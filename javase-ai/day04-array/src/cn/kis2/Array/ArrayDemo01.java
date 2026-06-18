package cn.kis2.Array;

public class ArrayDemo01 {
    static void main() {
        // 随机点名
        printArray();
    }

    static void printArray() {
        // 静态声明数组
        String[] names = {"张三", "李四", "王五", "赵六", "小王", "小张","唐伯虎"};
        // String[] names =new String[]{"张三", "李四", "王五", "赵六", "小王", "小张","唐伯虎"}; {"张三", "李四", "王五", "赵六", "小王", "小张","唐伯虎"};

        // 0-1 (0-1)之间的小数
        // names.length 数组的长度 元素的个数
        // 强转 0-2 (0-1)
        int index = (int) (Math.random() * names.length);
        // 访问数组元素 names[索引]
        String name = names[index];
        System.out.println(name);
        System.out.println(names);
    }
}
