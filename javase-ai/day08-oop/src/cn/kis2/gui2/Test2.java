package cn.kis2.gui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    static void main() {
        // 第一种写法 提供实现类 创建实现类代表事件监听器对象
        JFrame jf = new JFrame("登录窗口");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null); // 居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 退出程序

        JPanel jp = new JPanel();
        jf.add(jp);

        JButton jb = new JButton("登录");
        jb.setBounds(100, 100, 100, 50);
        jp.add(jb);
        jf.setVisible(true);

        jb.addActionListener(new MyActionListener(jf));
    }

}


// 创建实现类
class MyActionListener implements ActionListener
{
    private JFrame jf;
    public MyActionListener(JFrame jf){
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf, "登录成功");
    }
}
