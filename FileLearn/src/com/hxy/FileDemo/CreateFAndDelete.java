package com.hxy.FileDemo;

import java.io.File;
import java.io.IOException;

public class CreateFAndDelete {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\aaa\\bbb");
        //创建文件，返回成功与否
        //如果父级路径不存在则出现IOException
        //创建的一定是文件，如果没有后缀名，则创建没有 后缀的文件
        boolean b1 = f1.createNewFile();
        System.out.println(b1);
        //创建单级文件夹 mkdir
        //windows系统中路径是唯一的，创建不了"D:\\aaa\\bbb"
        File f2 = new File("D:\\aaa\\ccc");
        boolean b2 = f2.mkdir();
        System.out.println(b2);
        //创建多级文件夹 mkdirs
        //它也可以用来创建单级文件夹，基本完全取代mkdir
        File f3 = new File("D:\\aaa\\aaa\\bbb\\ccc");
        boolean b3 = f3.mkdirs();
        System.out.println(b3);
        //delete() 删除文件和空的文件夹
        //delete（）不走回收站
        //如果文件夹不为空则删不了
        boolean bb = f1.delete();//删除bbb文件
        System.out.println(bb);
        boolean b4 = f3.delete();
        System.out.println(b4);
    }
}
