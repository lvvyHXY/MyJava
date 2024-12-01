package com.hxy.FileDemo;

import java.io.File;

public class P3 {
    public static void main(String[] args) {
        //需求：找到电脑内所有的.avi文件，考虑子文件夹:我认为应该要递归了
        File f = new File("C:\\");
        hasAvi(f);
    }
    public static void hasAvi(){
        File[] files = File.listRoots();
        for (File file : files) {
            hasAvi(file);
        }
    }
    public static void hasAvi(File file){
        File[] files = file.listFiles();
        if (files != null) {//不加判断会报空指针异常，因为这个方法没有权限访问的文件夹返回值为空
            for (File f : files) {
                if(f.isFile() && f.getName().endsWith(".avi"))
                    System.out.println(f.getAbsolutePath());
                else {//不为空,参数要为次一级路径
                    hasAvi(f);
                }
            }
        }
    }
}
