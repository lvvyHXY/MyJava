package com.hxy.FileDemo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P6 {
    public static void main(String[] args) {
        //统计文件夹中所有文件种类的个数
        //由于不知道由哪些种类，所以不好用计数器
        //我们选择递归+Map集合来做
        File f = new File("D:\\Java\\FileLearn\\src");
        HashMap<String, Integer> typeCount = getTypeCount(f);
        Set<Map.Entry<String, Integer>> entries = typeCount.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

    }
    public static HashMap<String,Integer> getTypeCount(File file){
        //哈希map计数
        HashMap<String,Integer> hm = new HashMap<>();
        //进入文件夹
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                String[] s = f.getName().split("\\.");
                if(s.length >= 2){
                    String type = s[s.length-1];
                    if(hm.containsKey(type)){
                        Integer count = hm.get(type);
                        count++;
                        hm.put(type,count);
                    }else {
                        hm.put(type,1);
                    }
                }
            }else {
                HashMap<String, Integer> sonMap = getTypeCount(f);//但是也要把递归的值加紧进来，就像上题的len一样
                //遍历子map统计文件并加进来
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    if(hm.containsKey(entry.getKey())){
                        //包含,累加
                        Integer value = hm.get(entry.getKey());
                        value += entry.getValue();
                    }else {
                        Integer value = entry.getValue();
                        hm.put(entry.getKey(),value);
                    }
                }
            }
        }
        return hm;
    }
}
