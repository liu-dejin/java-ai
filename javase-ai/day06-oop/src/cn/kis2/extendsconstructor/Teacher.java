package cn.kis2.extendsconstructor;

public class Teacher extends People {
    private String skill;

    public Teacher(String name, String skill, char sex) {
        // 可以把子类继承自父类这部分数据也完成初始化赋值
        super(name, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
