package com.itheima.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    //属性：牌的名称(格式：数字-数字），牌的正反面，牌是否可被点击，牌是否被点击过
    private String name;
    private boolean up;
    private boolean canClick = false;
    private boolean clicked = false;

    //需要实现的方法，点击，有参构造
    public Poker(String name,boolean up){
        this.name = name;
        this.up = up;
        if(this.up){
            turnFront();
        }else turnRear();
        this.setSize(71,96);
        this.setVisible(true);
        this.addMouseListener(this);
    }


    public void turnFront() {
        setIcon(new ImageIcon("image\\poker\\"+name+".png"));
        this.up = true;
    }
    public void turnRear() {
        setIcon(new ImageIcon("image\\poker\\rear.png"));
        this.up = false;
    }

//被点击：是否可以被点击？是否被点击过？点击过则下降，没有点击过则上升
    @Override
    public void mouseClicked(MouseEvent e) {
        int step = 0;
        if(canClick){
            if(clicked){
                step = -20;
            }else step = 20;
            clicked = !clicked;
            Point before = this.getLocation();
            Point after = new Point(before.x,before.y+step);
            this.setLocation(after);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}
