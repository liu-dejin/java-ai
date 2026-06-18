package cn.kis2.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class BeautifulLoginUI {

    public static void main(String[] args) {
        // 设置系统外观为Nimbus，使Swing组件更美观
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            LoginFrame frame = new LoginFrame();
            frame.setVisible(true);
        });
    }

    static class LoginFrame extends JFrame {
        private JTextField usernameField;
        private JPasswordField passwordField;
        private JButton loginButton;
        private JButton clearButton;

        public LoginFrame() {
            setTitle("欢迎登录");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(500, 380);
            setLocationRelativeTo(null); // 居中显示
            setResizable(false);
            // 设置窗口圆角（通过AWTUtilities，如果不支持则忽略）
            setUndecorated(true); // 去掉系统装饰，自定义圆角窗口
            setShape(new RoundRectangle2D.Double(0, 0, 500, 380, 30, 30));

            // 主面板
            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.setBackground(new Color(245, 247, 250));
            mainPanel.setBorder(new EmptyBorder(20, 30, 30, 30));

            // 标题面板
            JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            titlePanel.setBackground(new Color(245, 247, 250));
            JLabel titleLabel = new JLabel("用户登录");
            titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 28));
            titleLabel.setForeground(new Color(51, 51, 51));
            titlePanel.add(titleLabel);
            mainPanel.add(titlePanel, BorderLayout.NORTH);

            // 表单面板
            JPanel formPanel = new JPanel(new GridBagLayout());
            formPanel.setBackground(new Color(245, 247, 250));
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(12, 10, 12, 10);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            // 用户名标签和输入框
            JLabel userLabel = new JLabel("用户名");
            userLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
            userLabel.setForeground(new Color(70, 70, 70));
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0.2;
            formPanel.add(userLabel, gbc);

            usernameField = new RoundTextField(20);
            usernameField.setFont(new Font("微软雅黑", Font.PLAIN, 14));
            usernameField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
                    BorderFactory.createEmptyBorder(8, 10, 8, 10)
            ));
            usernameField.setOpaque(false);
            usernameField.setBackground(Color.WHITE);
            gbc.gridx = 1;
            gbc.weightx = 0.8;
            formPanel.add(usernameField, gbc);

            // 密码标签和输入框
            JLabel passLabel = new JLabel("密码");
            passLabel.setFont(new Font("微软雅黑", Font.PLAIN, 16));
            passLabel.setForeground(new Color(70, 70, 70));
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0.2;
            formPanel.add(passLabel, gbc);

            passwordField = new RoundPasswordField(20);
            passwordField.setFont(new Font("微软雅黑", Font.PLAIN, 14));
            passwordField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
                    BorderFactory.createEmptyBorder(8, 10, 8, 10)
            ));
            passwordField.setOpaque(false);
            passwordField.setBackground(Color.WHITE);
            gbc.gridx = 1;
            gbc.weightx = 0.8;
            formPanel.add(passwordField, gbc);

            mainPanel.add(formPanel, BorderLayout.CENTER);

            // 按钮面板
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
            buttonPanel.setBackground(new Color(245, 247, 250));

            loginButton = new GradientButton("登 录", new Color(66, 133, 244), new Color(52, 168, 83));
            loginButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
            loginButton.setForeground(Color.WHITE);
            loginButton.setFocusPainted(false);
            loginButton.setBorderPainted(false);
            loginButton.setPreferredSize(new Dimension(130, 42));
            loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

            clearButton = new GradientButton("重 置", new Color(158, 158, 158), new Color(117, 117, 117));
            clearButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
            clearButton.setForeground(Color.WHITE);
            clearButton.setFocusPainted(false);
            clearButton.setBorderPainted(false);
            clearButton.setPreferredSize(new Dimension(130, 42));
            clearButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

            buttonPanel.add(loginButton);
            buttonPanel.add(clearButton);
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            // 添加关闭按钮（自定义关闭）
            JPanel closePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
            closePanel.setOpaque(false);
            JLabel closeLabel = new JLabel("✕");
            closeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            closeLabel.setForeground(Color.GRAY);
            closeLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            closeLabel.setBorder(new EmptyBorder(10, 0, 0, 15));
            closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    System.exit(0);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    closeLabel.setForeground(Color.RED);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    closeLabel.setForeground(Color.GRAY);
                }
            });
            closePanel.add(closeLabel);
            mainPanel.add(closePanel, BorderLayout.NORTH);

            // 监听登录事件
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = usernameField.getText().trim();
                    String password = new String(passwordField.getPassword());

                    if (username.isEmpty() || password.isEmpty()) {
                        JOptionPane.showMessageDialog(LoginFrame.this,
                                "用户名和密码不能为空！",
                                "提示",
                                JOptionPane.WARNING_MESSAGE);
                    } else if (username.equals("admin") && password.equals("123456")) {
                        JOptionPane.showMessageDialog(LoginFrame.this,
                                "登录成功！欢迎 " + username,
                                "成功",
                                JOptionPane.INFORMATION_MESSAGE);
                        // 这里可以跳转到主界面等操作
                    } else {
                        JOptionPane.showMessageDialog(LoginFrame.this,
                                "用户名或密码错误！",
                                "错误",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    usernameField.setText("");
                    passwordField.setText("");
                }
            });

            setContentPane(mainPanel);
        }
    }

    // 圆角文本框组件
    static class RoundTextField extends JTextField {
        private static final long serialVersionUID = 1L;
        private Shape shape;

        public RoundTextField(int columns) {
            super(columns);
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            super.paintComponent(g2);
            g2.dispose();
        }

        @Override
        protected void paintBorder(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getForeground());
            g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            g2.dispose();
        }

        @Override
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            }
            return shape.contains(x, y);
        }
    }

    static class RoundPasswordField extends JPasswordField {
        private static final long serialVersionUID = 1L;
        private Shape shape;

        public RoundPasswordField(int columns) {
            super(columns);
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            super.paintComponent(g2);
            g2.dispose();
        }

        @Override
        protected void paintBorder(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getForeground());
            g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            g2.dispose();
        }

        @Override
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            }
            return shape.contains(x, y);
        }
    }

    // 渐变按钮组件
    static class GradientButton extends JButton {
        private static final long serialVersionUID = 1L;
        private Color startColor;
        private Color endColor;

        public GradientButton(String text, Color startColor, Color endColor) {
            super(text);
            this.startColor = startColor;
            this.endColor = endColor;
            setContentAreaFilled(false);
            setFocusPainted(false);
            setBorderPainted(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int w = getWidth();
            int h = getHeight();
            GradientPaint gp = new GradientPaint(0, 0, startColor, w, h, endColor);
            g2.setPaint(gp);
            g2.fillRoundRect(0, 0, w, h, 20, 20);
            g2.setColor(getForeground());
            FontMetrics fm = g2.getFontMetrics();
            int x = (w - fm.stringWidth(getText())) / 2;
            int y = (h + fm.getAscent() - fm.getDescent()) / 2;
            g2.drawString(getText(), x, y);
            g2.dispose();
        }
    }
}
