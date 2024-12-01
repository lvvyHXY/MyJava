package com.hxy.FileDemo;

import java.io.File;

public class P5 {
    public static void main(String[] args) {
        //统计一个文件夹的大小，考虑子文件夹
        File file = new File("D:\\aaa");
        System.out.println(getFileSize(file));
    }
    public static long getFileSize(File file){
        long len = 0;
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                len = len + f.length();
            }else {
                len = len + getFileSize(f);
            }
        }
        return len;
    }
}
