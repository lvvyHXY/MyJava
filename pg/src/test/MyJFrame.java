package test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame extends JFrame implements MouseListener {
    JButton jtb1  =  new JButton("点");
    public MyJFrame(){
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
        jtb1.addMouseListener(this);
        this.getContentPane().add(jtb1);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("释放");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
