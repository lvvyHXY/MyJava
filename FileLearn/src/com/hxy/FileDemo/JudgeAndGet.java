package com.hxy.FileDemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JudgeAndGet {
    public static void main(String[] args) {
        //判断有三个
        //isDirectory  isFile  exsists
        File f1 = new File("D:\\Java\\APILearning");
        System.out.println(f1);
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println("===================");
        //获取
        //length长度
        System.out.println(f1.length());//292 KB (299,723 字节)//但是输出了4096 其实文肩胛大小是无法获取的，只能获取文件大小
        //getAbsolutePath 绝对路径
        File f2 = new File("FileLearn\\image\\win.png");//这是一个项目下的相对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());//可以看到相对路径创建的文件也是获取的绝对路径
        //getPath 路径
        String path1 = f1.getPath();
        String path2 = f2.getPath();//此时获取的是相对路径
        System.out.println(path1);
        System.out.println(path2);
        //getName 文件名.后缀 || 文件夹名
        String name1 = f1.getName();
        String name2 = f2.getName();
        System.out.println(name1);
        System.out.println(name2);
        //lastModified 最后修改时间,返回毫秒值
        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        Date d = new Date(0L);
        d.setTime(time);
        System.out.println(d);
        System.out.println(sdf.format(d));
    }
}
