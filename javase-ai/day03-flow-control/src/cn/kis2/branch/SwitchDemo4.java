package cn.kis2.branch;

public class SwitchDemo4 {
    static void main() {
        tese1();
        tese2();
        tese3();
    }

    // switch 注意事项 穿透性应用
    // 表达式只支持 byte chart int char jdk5支持枚举 jdk7支持String 不支持double float long
    static void tese1() {
        // double a = 10.5;
        // switch (a) { // double 不支持
        //     case 10.1:
        //         System.out.println("10.1");
        //         break;
        //     case 10.5:
        //         System.out.println("10.5");
        //         break;
        //     case 10.7:
        //         System.out.println("10.7");
        //         break;
        // }
    }

    static void tese2() {
        // case 不能重复
        int a = 10;
        int b = 20;
        switch (a) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
        }
    }


    static void tese3() {
        String day = "周一";
        // switch 不写break 会穿透
        // 周一到周四写代码 周五到周天摸鱼
        switch (day) {
            case "周一":
            case "周二":
            case "周三":
            case "周四":
                System.out.println("写代码");
                break;
            case "周五":
            case "周六":
            case "周天":
                System.out.println("摸鱼");
                break;
        }
    }

}
