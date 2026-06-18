package cn.kis2.ui;

import cn.kis2.bean.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// 自定义登录界面
public class LoginUI extends JFrame implements ActionListener {
    private JTextField loginNameField; // 用户名输入框
    private JPasswordField passwordField; // 密码输入框
    private JButton loginButton; // 登录按钮
    private  JButton registerButton; // 注册按钮

    // 定义一个集合 存储全部用户信息
    private static ArrayList<User> allUser = new ArrayList<>();
    // 测试 数据
    static {
        allUser.add(new User("超级管理员", "123456", "admin"));
        allUser.add(new User("张三", "123456", "zhangsan"));
        allUser.add(new User("李四", "123456", "lisi"));
    }

    public LoginUI(){
        super("登录界面");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null); // 居中显示

        createAndShowGUI();
    }

    private  void createAndShowGUI() {
        // 创建主窗口
        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 240, 240));

        // 设置字体和颜色
        Font customFont = new Font("楷体", Font.BOLD, 18);
        Color primaryColor = new Color(66, 135, 245);
        Color secondaryColor = new Color(204, 204, 204); // 更浅的颜色用于注册按钮

        // 标题
        JLabel titleLabel = new JLabel("人事管理系统");
        titleLabel.setBounds(50, 30, 300, 30);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 24));
        panel.add(titleLabel);

        // 用户名标签
        JLabel usernameLabel = new JLabel("用户名：");
        usernameLabel.setBounds(50, 100, 150, 30);
        usernameLabel.setFont(customFont);
        panel.add(usernameLabel);

        // 用户名输入框
        loginNameField = new JTextField();
        loginNameField.setBounds(160, 100, 190, 30);
        loginNameField.setFont(customFont);
        panel.add(loginNameField);

        // 密码标签
        JLabel passwordLabel = new JLabel("密   码：");
        passwordLabel.setBounds(50, 150, 150, 30);
        passwordLabel.setFont(customFont);
        panel.add(passwordLabel);

        // 密码输入框
        passwordField = new JPasswordField();
        passwordField.setBounds(160, 150, 190, 30);
        passwordField.setFont(customFont);
        passwordField.setEchoChar('*');
        panel.add(passwordField);

        // 登录按钮
        loginButton = new JButton("登   录");
        loginButton.setBounds(50, 200, 150, 30);
        loginButton.setFont(customFont);
        loginButton.setBackground(primaryColor);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);
        loginButton.addActionListener(this);

        // 注册按钮
        registerButton = new JButton("注   册");
        registerButton.setBounds(200, 200, 150, 30);
        registerButton.setFont(customFont);
        registerButton.setBackground(secondaryColor);
        registerButton.setForeground(Color.BLACK);
        panel.add(registerButton);
        registerButton.addActionListener(this);

        // 添加面板到窗口
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 登录或注册 e.getSource()按钮对象
        JButton btn = (JButton)e.getSource();
        if (btn == loginButton) {
            // 登录逻辑
            System.out.println("登录");
            login();
        }else{
            // 注册逻辑
            System.out.println("注册");
        }

    }
    private void login() {
        // 获取用户输入的用户名和密码
        String username = loginNameField.getText();
        String password = new String(passwordField.getPassword());
        // 遍历对比
        User user = queryUserByLoginName(username);
        if (user != null && user.getPassword().equals(password)) {
            // 登录成功
            JOptionPane.showMessageDialog(this, "登录成功！");
            // 跳转到员工管理界面
            new EmployeeManagerUI(user.getUsername());
            this.dispose(); // 关闭当前登录界面
        } else {
            // 登录失败
            JOptionPane.showMessageDialog(this, "登录失败，请检查用户名和密码！");
        }
    }
    // 登录名称查询用户对象返回
    private User queryUserByLoginName(String loginName) {
        for (int i = 0; i < allUser.size(); i++) {
            User user = allUser.get(i);
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null;
    }
}
