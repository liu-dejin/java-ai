package cn.kis2.demo7list;

import java.util.LinkedList;

public class ListDemo2 {
    // linked list 做一个队列对象 先入先出 后入后出
    static void main() {
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addLast("赵敏");
        queue.addLast("小昭");
        queue.addLast("张无忌");
        queue.addLast("张三丰");
        System.out.println(queue);

        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("-------------------------------------------------------");

        // 栈
        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("第一颗子弹"); // 入栈push
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");

        System.out.println(stack.removeFirst());    // 出栈pop
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);
    }
}
