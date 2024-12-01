package com.hxy.FileDemo;

import java.io.File;

public class P4 {
    public static void main(String[] args) {
        // 需求：删除多级文件夹:包含子文件，要用到递归
        File file = new File("D:\\Java\\FileLearn\\aaa");
        deleteFile(file);
    }
    public static void deleteFile(File file){
        File[] files = file.listFiles();
            for (File f : files) {
                if(f.isFile()){
                    f.delete();
                }else {
                    deleteFile(f);
                }
            }
        //最后把自己也删除掉,得写for外面，因为空文件夹不会进入循环
        file.delete();
    }
}
