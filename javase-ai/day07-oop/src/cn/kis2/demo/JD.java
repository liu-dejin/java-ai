package cn.kis2.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch {
    private String name;
    // 状态: 开关状态
    private Boolean status; // false 默认关闭状态

    @Override
    public void press() {
        // 控制开关
        status = !status;
        System.out.println("JD press: " + status);
    }
}
