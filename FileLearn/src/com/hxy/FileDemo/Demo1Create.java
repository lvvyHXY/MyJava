package com.hxy.FileDemo;

import java.io.File;

public class Demo1Create {
    public static void main(String[] args) {
        //直接传入路径
        String path = "D:\\code\\a.txt";
        File f1 = new File(path);
        System.out.println(f1);
        //父级路径（D:\code）和子级（a.txt）路径拼接
        String fatherPath = "D:\\code";
        String childPath = "a.txt";
        File f2 = new File(fatherPath, childPath);
        System.out.println(f2);
        //文件对象和字符串拼接
        File ff = new File("D:\\code");
        String name = "a.txt";
        File f3 = new File(ff,name);
        System.out.println(f3);
    }
}
