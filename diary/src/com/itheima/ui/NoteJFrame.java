package com.itheima.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class NoteJFrame extends JFrame implements ActionListener {

    ArrayList<Content> fileList = new ArrayList<>();
    //创建三个按钮
    JButton add = new JButton("添加");
    JButton update = new JButton("修改");
    JButton delete = new JButton("删除");

    //创建表格组件
    JTable table;

    //创建菜单的导入和导出
    JMenuItem exportItem = new JMenuItem("导出");
    JMenuItem importItem = new JMenuItem("导入");

    public NoteJFrame() throws IOException, ClassNotFoundException {
        //读取save文件并加载fileList集合
        readSaves();
        //初始化界面
        initFrame();
        //初始化菜单
        initJmenuBar();
        //初始化组件
        initView();
        //让界面显示出来
        this.setVisible(true);
    }

    private void readSaves()  {
       File file = new File("D:\\Java\\diary\\saves");
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                try {
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file1));
                    Content content = (Content) ois.readObject();
                    fileList.add(content);
                    ois.close();
                    System.out.println(fileList);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }
        }


    }

    public NoteJFrame(ArrayList<Content> fileList) throws IOException {

        //重置数据
        readSaves();
        /*this.fileList = fileList;*/
        //初始化界面
        initFrame();
        //初始化菜单
        initJmenuBar();
        //初始化组件
        initView();
        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前那个组件被点击
        Object obj = e.getSource();
        if (obj == add) {
            System.out.println("添加按钮被点击");
            this.setVisible(false);
            new AddJFrame(fileList);

        } else if (obj == update) {
            System.out.println("修改按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，跳转添加界面


            //获取用户选择了表格中的哪一行
            //i = 0: 表示用户选择了第一行
            //i = 1: 表示用户选择了第一行
            //i有两个作用：
            //i小于0，表示用户没有选择，此时无法修改
            //i大于等于0：通过这个行数就可以获取二维数组中对应的数据
            int i = table.getSelectedRow();
            new UpdateJFrame(i);
            System.out.println(i);


        } else if (obj == delete) {
            System.out.println("删除按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //需求：实现判断用户有没有选中表格中的数据？
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，弹框提示：是否确定删除。此时提示的弹框用showChooseJDialog方法
            //作用：展示一个带有确定和取消按钮的弹框
            //方法的返回值：0 表示用户点击了确定
            //             1 表示用户点击了取消
            //该弹框用于用户删除时候，询问用户是否确定删除
            int choose = table.getSelectedRow();
            if (choose < 0) {
                showJDialog("未选择");
            }else {
                int i = showChooseJDialog();
                if(i==0){
                    fileList.remove(choose);
                    try {
                        writeSaves();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    this.setVisible(false);
                }else{//i==1
                    this.setVisible(false);
                    try {
                        new NoteJFrame(fileList);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            }
            //用集合删除元素然后重新写入文件可行吗
/*            //删除还需要调整其他文件的位置，因为这个程序的核心就在于索引是对应的
            //那就拷贝咯，复制到临时文件，覆写新文件
            //先拷贝
            File file = new File("D:\\Java\\diary\\saves");
            File[] files = file.listFiles();
            if (files != null) {

                if (i == fileList.size() - 1) {
                    File f = new File("D:\\Java\\diary\\saves\\saves" + (fileList.size() - 1) + ".data");
                    f.delete();
                    //还需要重置文件名称啊
                    System.out.println(i);
                    return;
                } else {
                    for (int index = i+1; index < files.length; index++) {
                        //创建一个临时文件，用于存储复制的数据
                        File tempFile = new File("D:\\Java\\diary\\temp");
                        //////如果是直接操作集合删除再重新读回去呢

                        //从i开始往前装就行
                        //索引不是删除的那个，其他的全部往前移动一位，创建一个同样大小的saves吗？还是一个个覆盖过去就行
                        //创建一个输出流，用于将数据写入临时文件
                        try {
                            //ObjectOutputStream oosTemp =new ObjectOutputStream(new FileOutputStream(tempFile));
                            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(files[index]));
                            //读
                            Content content = (Content) ois.readObject();
                            //写入temp
                            //oosTemp.writeObject(content);
                            //写到前一个
                            ObjectOutputStream oosTo = new ObjectOutputStream(new FileOutputStream(files[index-1]));
                            oosTo.writeObject(content);
                            //文件改名
                            files[index].renameTo(new File("D:\\Java\\diary\\saves\\saves" + (index) + ".data"));
                        } catch (FileNotFoundException ex) {
                            throw new RuntimeException(ex);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } catch (ClassNotFoundException ex) {
                            throw new RuntimeException(ex);
                        }
                        //创建一个输入流，用于读取源文件
                    }*/
                    /*//然后删除最后一个，前面的全都依此覆盖
                    File f = new File("D:\\Java\\diary\\saves\\saves" + (fileList.size() - 1) + ".data");
                    f.delete();
                    //还需要重置文件名称啊
                    System.out.println(i);*/
            /* }*/
        }




        else if (obj == exportItem) {
                System.out.println("菜单的导出功能");

            } else if (obj == importItem) {
                System.out.println("菜单的导入功能");

            }
    }

    private void writeSaves() throws IOException {
        for (int index=0;index<fileList.size();index++) {
            //把集合里的数据覆盖掉存档
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\diary\\saves\\saves" +index+".data"));
                //给他们改一下编号
                fileList.get(index).setNumber("编号"+index);
                oos.writeObject(fileList.get(index));
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //删除最后一个存档，此处fileList大小已经减一了：3 -》2 我要删除第三个，所以索引就是fileList.size()
        File f = new File("D:\\Java\\diary\\saves\\saves" + fileList.size() + ".data");
        f.delete();
        new NoteJFrame(fileList);
    }

    //初始化组件
    private void initView() throws IOException{
        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);
        //定义表格的标题
        Object[] tableTitles = {"编号", "标题", "正文"};
        //定义表格的内容
        //二维数组中的每一个一维数组，是表格里面的一行数据
        //创建一个空的数组，再创建NoteJFrame时判断集合空不空，这样就能来实现删除之后是空空的的效果了，然后通过list来写入tabledatas
        Object[][] tabledataso = new Object[0][0];
        //Object[][] tabledatas = new Object[30][3];
        //初始化，如果集合不为空来调整他的大小不让他一下出现一堆行数据
        Object[][] tabledatas = new Object[0][];
        //读取数据改变tabledatas内容
        if(fileList.size()!=0){
            tabledatas = new Object[fileList.size()][3];
            for (int i = 0; i < fileList.size(); i++) {
                tabledatas[i][0] = fileList.get(i).getNumber();
                tabledatas[i][1] = fileList.get(i).getTitle();
                tabledatas[i][2] = fileList.get(i).getContent();
            }
        }




        //定义表格组件
        //并给表格设置标题和内容
        if(fileList.size()==0){
            table = new JTable(tabledataso, tableTitles);
        }else {
            table = new JTable(tabledatas, tableTitles);
        }

        table.setBounds(40, 70, 504, 380);

        //创建可滚动的组件，并把表格组件放在滚动组件中间
        //好处：如果表格中数据过多，可以进行上下滚动
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(40,70,504,380);
        this.getContentPane().add(jScrollPane);

        //给三个按钮设置宽高属性，并添加点击事件
        add.setBounds(40, 466, 140, 40);
        update.setBounds(222, 466, 140, 40);
        delete.setBounds(404, 466, 140, 40);

        add.setFont(new Font("宋体", Font.PLAIN, 24));
        update.setFont(new Font("宋体", Font.PLAIN, 24));
        delete.setFont(new Font("宋体", Font.PLAIN, 24));

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);


        this.getContentPane().add(add);
        this.getContentPane().add(update);
        this.getContentPane().add(delete);
    }

    //初始化菜单
    private void initJmenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");

        //把5个存档，添加到saveJMenu中
        functionJMenu.add(exportItem);
        functionJMenu.add(importItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);

        //绑定点击事件
        exportItem.addActionListener(this);
        importItem.addActionListener(this);

        //给菜单设置颜色
        jMenuBar.setBackground(new Color(230,230,230));

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(new Color(212,212,212));
    }

    //只创建一个弹框对象
    JDialog jDialog = new JDialog();
    //因为展示弹框的代码，会被运行多次
    //所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
    //直接调用就可以了。
    //展示弹框
    public void showJDialog(String content) {
        if(!jDialog.isVisible()){
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(200, 150);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 200, 150);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }

    /*
    *  作用：展示一个带有确定和取消按钮的弹框
    *
    *  方法的返回值：
    *       0 表示用户点击了确定
    *       1 表示用户点击了取消
    *       该弹框用于用户删除时候，询问用户是否确定删除
    * */
    public int showChooseJDialog() {
        return JOptionPane.showConfirmDialog(this, "是否删除选中数据？","删除信息确认",JOptionPane.YES_NO_OPTION);
    }
}
