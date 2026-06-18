package cn.kis2.innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    // 匿名内部类使用场景
    static void main() {
        // 创建一个登录窗口 只有一个登录按钮
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 300);
        win.setLocationRelativeTo(null); // 居中
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        // 给按钮加一个点击事件监听器 这样就可以监听用户的点击操作
        // btn.addActionListener(new ClickListener());
        // 开发中不是我们要主动去写匿名内部类,而是用别人的功能,别人让我们写一个匿名内部类我们才会写
        btn.addActionListener(e -> System.out.println("登录成功"));
    }
}

// class ClickListener implements ActionListener {
//     @Override
//     public void actionPerformed(ActionEvent e) {
//         System.out.println("点击了登录按钮");
//     }
// }
