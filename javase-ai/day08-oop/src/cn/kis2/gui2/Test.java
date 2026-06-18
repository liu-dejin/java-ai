package cn.kis2.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    static void main() {
        JFrame jf = new JFrame("登录窗口");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        jf.add(jp);

        JButton jb = new JButton("登录");
        jb.setBounds(100, 100, 100, 50);
        jb.setFocusable(false);  // 关键：让按钮不抢焦点

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf, "有人点击了登录");
            }
        });

        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println("有人点击了上");
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    System.out.println("有人点击了下");
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println("有人点击了左");
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println("有人点击了右");
                }
            }
        });

        jp.add(jb);
        jf.setVisible(true);

        // 确保窗口获得焦点
        jf.setFocusable(true);
        jf.requestFocusInWindow();
    }
}
