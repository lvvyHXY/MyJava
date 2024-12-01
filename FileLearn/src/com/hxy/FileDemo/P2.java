package com.hxy.FileDemo;

import java.io.File;

public class P2 {
    public static void main(String[] args) {
        //定义一个方法寻找某一个文件夹中是否有.avi结尾的文件
        File f = new File("D:\\Java\\FileLearn\\aaa");
        System.out.println(findFile(f));
    }
    public static boolean findFile(File file){
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isFile() && files[i].getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
