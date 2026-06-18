package cn.kis2.demo4proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star implements StarService {
    private String name;

    @Override
    public void sing(String name) {
        System.out.println(this.name + "唱歌" + name);
    }

    @Override
    public String dance() {
        System.out.println(this.name + "唱歌");
        return "谢谢大家";
    }


}
