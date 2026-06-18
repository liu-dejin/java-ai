package cn.kis2.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame() {

        this.setTitle("登录");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init(); // 初始化窗口组件
    }

    private void init() {
        JPanel jp = new JPanel();
        this.add(jp);

        JButton jb = new JButton("登录");
        jb.setBounds(100, 100, 100, 50);
        jp.add(jb);
        jb.addActionListener(this);

        // jb.addActionListener(e->JOptionPane.showMessageDialog(this,"点击了登录"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "有人点击了登录");
    }
}
