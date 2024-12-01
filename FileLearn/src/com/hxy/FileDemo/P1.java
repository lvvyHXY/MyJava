package com.hxy.FileDemo;

import java.io.File;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) throws IOException {
        //当前模块下创建aaa文件夹a.txt
        File f1 = new File("aaa");
        boolean b1 = f1.mkdirs();
        System.out.println(b1);
        File f2 = new File("aaa\\a.txt");
        boolean b2 = f2.createNewFile();
        System.out.println(b2);
    }
}
