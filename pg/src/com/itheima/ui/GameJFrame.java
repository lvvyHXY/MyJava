package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //1.游戏主界面
    //JFrame是JavaBean类
    //属性：size，location，setVisible
    //上下左右，统计步数，跳关，最终结果。。。
    int[][] data = new int[4][4];
//空白格的位置
    int x = 0;
    int y = 0;
    //路径
    String path = "D:\\Java\\puzzlegame\\image\\animal\\animal3\\";
    //胜利
    int[][] win = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};

    //步数
    int step = 0;

    //选项下对象,放到成员变量，方便ActionListener方法调用他
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    JMenuItem animalItem = new JMenuItem("动物拼图");
    JMenuItem girlItem = new JMenuItem("美女拼图");
    JMenuItem sportItem = new JMenuItem("运动拼图");


    public GameJFrame() {
        //设置界面
        initJFrame();
        //菜单
        initJMenuBar();
        //初始化数据
        initData();
        //初始化图片
        initImage();
        //显示
        this.setVisible(true);
    }

    private void initData() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //打乱数组中的数据
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        //装入二维数组里
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                x = i/4;
                y = i%4;
            }
            data[i/4][i%4] = arr[i];
        }
    }

    private void initImage() {

        //清除所有图片
        this.getContentPane().removeAll();

        if(victory()){
            JLabel winJLabel = new JLabel(new ImageIcon("D:\\Java\\puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        //添加步数
        JLabel stepJLabel = new JLabel("步数："+step);
        stepJLabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepJLabel);

        //先加载的图片在上方，会盖住后加载的
        //所以背景放在图片后面
        //外循环看列，外循环看行
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个图片ImageIcon的对象
                ImageIcon icon1 = new ImageIcon(path+data[i][j]+".jpg");
                //创建JLable的对象（管理容器）
                JLabel jLabel = new JLabel(icon1);
                //指定图片位置
                jLabel.setBounds(105 * j + 83,105 * i + 134 ,105,105);
                //添加图片边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面
                this.getContentPane().add(jLabel);
            }
        }

        //设置背景图片
        ImageIcon bg = new ImageIcon("image\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
        //重新绘制界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //初始化菜单
        //创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changeJMenu = new JMenu("更换图片");

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        animalItem.addActionListener(this);
        girlItem.addActionListener(this);
        sportItem.addActionListener(this);
        //将每一个选项下的条目添加到选项
        changeJMenu.add(animalItem);
        changeJMenu.add(girlItem);
        changeJMenu.add(sportItem);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        functionJMenu.add(changeJMenu);
        aboutJMenu.add(accountItem);
        
        //菜单选项添加到菜单
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        //整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置宽高
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
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            this.getContentPane().removeAll();
            ImageIcon all = new ImageIcon(path+"all.jpg");
            JLabel allJLabel = new JLabel(all);
            allJLabel.setBounds(83,134,420,420);
            this.getContentPane().add(allJLabel);
            //设置背景图片
            ImageIcon bg = new ImageIcon("image\\background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(victory()){
            return;
        }

        int code = e.getKeyCode();
        if(code == 37){
            System.out.println("向左");
            if(y == 3){
                return;
            }else{
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;
            }
            step++;
            initImage();
        }else if(code == 38){
            System.out.println("向上");
            if(x == 3){
                return;
            }else{
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            }
            step++;
            initImage();
        }else if(code == 39){
            System.out.println("向右");
            if(y == 0){
                return;
            }else{
                data[x][y] = data[x][y-1];
                data[x][y-1] = 0;
                y--;
            }
            step++;
            initImage();
        }else if(code == 40){
            System.out.println("向下");
            if(x == 0){
                return;
            } else{
                data[x][y] = data[x-1][y];
                data[x-1][y] = 0;
                x--;
            }
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};
            initImage();
        }
    }
    public boolean victory(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(data[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == replayItem){
            step = 0;
            this.initData();
            this.initImage();
        } else if (e.getSource() == reLoginItem) {
            this.setVisible(false);
            new LoginJFrame();
            System.out.println("重新登录");
        }else if(e.getSource() == closeItem){
            System.out.println("关闭游戏");
            System.exit(0);
        }else if(e.getSource() == accountItem){
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.png"));
            jDialog.add(jLabel);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (e.getSource() == animalItem) {
            Random r = new Random();
            int index = r.nextInt(7) + 1;
            path = "D:\\Java\\puzzlegame\\image\\animal\\animal"+ index + "\\";
            step = 0;
            initData();
            initImage();
        }
        else if(e.getSource() == girlItem){
            Random r = new Random();
            int index = r.nextInt(10) + 1;
            path = "D:\\Java\\puzzlegame\\image\\girl\\girl"+ index + "\\";
            step = 0;
            initData();
            initImage();
        } else if (e.getSource() == sportItem) {
            Random r = new Random();
            int index = r.nextInt(9) + 1;
            path = "D:\\Java\\puzzlegame\\image\\sport\\sport"+ index + "\\";
            step = 0;
            initData();
            initImage();
        }
    }
}
    

