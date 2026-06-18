package cn.kis2.demo;

public class SmartControl {
    private static final SmartControl smartControlInstance = new SmartControl();

    private SmartControl() {
    }

    public static SmartControl getInstance() {
        return smartControlInstance;
    }

    // 多态
    public void control(JD jd) {
        System.out.println("开始你的操作");
        System.out.println(jd.getName() + "目前的状态" + (jd.getStatus() ? "开着" : "关着"));
        jd.press();
        System.out.println(jd.getName() + "状态已经是" + (jd.getStatus() ? "开着" : "关着"));
    }


    public void printAllStatus(JD[] jds) {
        for (int i = 0; i < jds.length; i++) {
            JD jd = jds[i];
            System.out.println((i + 1) + "," + jd.getName() + "目前状态" + (jd.getStatus() ? "开着" : "关着"));
        }
    }
}
