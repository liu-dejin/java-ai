package cn.kis2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MainFrame extends JFrame {
    private static final String imagePath = "stone-maze/src/image/";
    private final int[][] winData = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
    // 存储数字色块 4*4
    private int[][] imageData = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
    // 定义当前色块的位置
    private int row;
    private int col;

    private int count; // 移动步数

    // 历史最小步数
    private int historyMinCount;

    public MainFrame() {
        historyMinCount = ReadFileScore();
        System.out.println("最小步数初始"+historyMinCount);
        // 初始化方法
        initFrame();
        // 打乱数字色块的顺序 再展示图片
        initRandomArray();
        // 显示数字色块
        initImages();
        // 展示菜单 系统退出 重启游戏
        initMenu();
        // 窗口绑定按键事件
        initKeyPressEvent();
        this.setVisible(true);


    }

    private void initKeyPressEvent() {
        // 绑定上下左右按键
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取按键
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        switchAndMove(Direction.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        switchAndMove(Direction.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        switchAndMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        switchAndMove(Direction.RIGHT);
                        break;
                    default:
                        break;
                }
            }
        });


    }

    private void switchAndMove(Direction direction) {
        // 通过方法控制移动
        switch (direction) {
            case UP:
                // 行必须小于3
                if (row < imageData.length - 1) {
                    // 当前空白色块位置 row col
                    // 需要被交换的位置 row+1 col
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row + 1][col];
                    imageData[row + 1][col] = temp;
                    // 空白色块行+1 列不变
                    row++;
                    count++;
                }
                break;
            case DOWN:
                // 行必须大于0
                if (row > 0) {
                    // 当前空白色块位置 row col
                    // 需要被交换的位置 row-1 col
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row - 1][col];
                    imageData[row - 1][col] = temp;
                    // 空白色块行-1 列不变
                    row--;
                    count++;
                }
                break;
            case LEFT:
                // 列必须小于3
                if (col < imageData.length - 1) {
                    // 当前空白色块位置 row col
                    // 需要被交换的位置 row col+1
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col + 1];
                    imageData[row][col + 1] = temp;
                    // 空白色块行不变 列+1
                    col++;
                    count++;
                }
                break;
            case RIGHT:
                // 列必须大于0
                if (col > 0) {
                    // 当前空白色块位置 row col
                    // 需要被交换的位置 row col-1
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col - 1];
                    imageData[row][col - 1] = temp;
                    // 空白色块行不变 列-1
                    col--;
                    count++;
                }
                break;
            default:
                break;
        }
        initImages();
    }

    private void initRandomArray() {

        // 打乱二维数组
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                // 随机两个行列位置
                int i1 = (int) (Math.random() * imageData.length);
                int j1 = (int) (Math.random() * imageData.length);
                int i2 = (int) (Math.random() * imageData.length);
                int j2 = (int) (Math.random() * imageData.length);
                int temp = imageData[i1][j1];
                imageData[i1][j1] = imageData[i2][j2];
                imageData[i2][j2] = temp;

            }
        }
        // 定位空白
        // 二维数组遍历 找到等于0 这个位置就是当前色块的数据
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] == 0) {
                    row = i;
                    col = j;
                    break OUT; // 跳出循环
                }
            }
        }
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("系统");
        JMenuItem exitJi = new JMenuItem("系统退出");
        menu.add(exitJi); // 添加菜单项
        exitJi.addActionListener(_ -> {
            dispose();
        });

        JMenuItem restartJi = new JMenuItem("重启");
        menu.add(restartJi);
        restartJi.addActionListener(_ -> {
            initRandomArray();
            initImages();
            count = 0;
        });
        JMenuItem zbJi = new JMenuItem("作弊");
        menu.add(zbJi);
        zbJi.addActionListener(_ -> {
            imageData = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
            initImages();
        });


        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }

    private void initImages() {
        // 先清空全部图层再刷新
        this.getContentPane().removeAll();

        // 刷新页面展示步数

        JLabel countTxt = new JLabel("当前移动" + count + "步");
        countTxt.setBounds(0, 0, 100, 20);
        countTxt.setForeground(Color.RED);
        countTxt.setFont(new Font("黑体", Font.BOLD, 12));
        this.add(countTxt);

        // 是不是第一次玩游戏
        if (historyMinCount != 0 ){
            JLabel historyCountTxt = new JLabel("最少步数：" + historyMinCount);
            historyCountTxt.setBounds(290, 0, 100, 20);
            // 文字改为红色 加粗
            historyCountTxt.setForeground(Color.RED);
            historyCountTxt.setFont(new Font("黑体", Font.BOLD, 12));
            this.add(historyCountTxt);
        }

        // 判断是否胜利
        if (isWin()) {
            // 展示胜利的图片
            JLabel label = new JLabel(new ImageIcon(imagePath + "win.png"));
            label.setBounds(124, 230, 266, 88);
            this.add(label);

            int fileCount = ReadFileScore();

            // 判断步数是否为0 0步表示第一次玩 需要写入文件
            if (fileCount == 0 || count < fileCount) {
                WriteFileScore(count);
            }

        }


        // 4*4矩阵
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                String imageName = imageData[i][j] + ".png";
                // 创建JLabel对象，设置图片
                JLabel label = new JLabel();
                // 设置图片
                label.setIcon(new ImageIcon(imagePath + imageName));
                // 设置图片位置
                label.setBounds(20 + j * 100, 60 + i * 100, 100, 100);
                // 展示到窗口
                this.add(label);
            }
        }
        JLabel bg = new JLabel(new ImageIcon(imagePath + "background.png"));
        bg.setBounds(0, 0, 450, 484);
        this.add(bg);

        // 刷新图层
        this.repaint();
    }

    private boolean isWin() {
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] != winData[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void initFrame() {
        this.setTitle("stone-maze v1.0");
        this.setSize(465, 575);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

    }

    // 读取文件中的最小步数
    private int ReadFileScore() {
        try (FileReader fr = new FileReader("stone-maze/src/score.txt"); BufferedReader br = new BufferedReader(fr);) {
            String line = br.readLine();
            return Integer.parseInt(line);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 把当前最小步数写入到文件中
    private void WriteFileScore(int count) {

        try (FileWriter fw = new FileWriter("stone-maze/src/score.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(count + "");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public enum Direction {
        UP, DOWN, LEFT, RIGHT;
    }
}
