package test;

import javax.swing.*;

public class MyClass extends JFrame{
    JFrame jFrame = new JFrame();
    public MyClass() {
        this.setSize(603, 680);
        //设置标题
        this.setTitle("拼图v0.0.1");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置位置
        this.setLocationRelativeTo(null);//居中
        //关闭游戏同时关闭程序
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中
        this.setLayout(null);
        this.setVisible(true);

        JButton jbt1 = new JButton();
        JButton jbt2 = new JButton();

        jbt1.setBounds(0, 0, 200, 50);
        jbt1.addActionListener(e -> System.out.println("点一下"));
        jFrame.getContentPane().add(jbt1);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    }
