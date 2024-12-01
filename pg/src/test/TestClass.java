package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TestClass extends JFrame implements ActionListener {
    JButton jtb1 = new JButton();
    JButton jtb2 = new JButton();

    public TestClass(){
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

                jtb1.setBounds(0, 0, 200, 50);
                jtb1.addActionListener(this);
                this.getContentPane().add(jtb1);
                this.setVisible(true);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jtb2.setBounds(200, 0, 100, 50);
        jtb2.addActionListener(this);
        this.getContentPane().add(jtb2);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


            }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if(obj == jtb1){
            jtb1.setSize(200,200);
    }else if(obj == jtb2){
            Random r = new Random();
            jtb2.setBounds(r.nextInt(500),r.nextInt(500),100,50);
        }
}
}
