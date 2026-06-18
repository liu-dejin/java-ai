package cn.kis2.gui;

import javax.swing.*;

public class JFrameDemo1 {
    static void main() {
        // 入门Swing
        // 1.窗口输入框登录按钮
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

    }
}
