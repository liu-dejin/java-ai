package cn.kis2.enumdemo;

public class Test2 {
    // 信息的分类和标记
    static void main() {
        // 模拟上下左右移动

        // 1.常量 没有参数约束
        move(Constant.UP);

        // 2.枚举 枚举对象有参数约束
        move2(M.DOWN);

    }

    public static void move(int direction) {
        // 根据方向移动
        switch (direction) {
            case Constant.UP:
                System.out.println("向上移动");
                break;
            case Constant.DOWN:
                System.out.println("向下移动");
                break;
            case Constant.LEFT:
                System.out.println("向左移动");
                break;
            case Constant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
                break;
        }
    }

    public static void move2(M direction) {
        // 根据方向移动
        switch (direction) {
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
                break;
        }
    }
}
