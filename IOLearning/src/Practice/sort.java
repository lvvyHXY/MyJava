package Practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sort {
    //文本文件中有 2-1-4-9-6-8
    //将其排序
    public static void main(String[] args) throws IOException {
        //读取数据
        FileReader fr = new FileReader("b.txt");
        //排序
        StringBuilder sb = new StringBuilder();
        int data;
        while((data = fr.read()) != -1){
            sb.append((char)data);
        }
        String str = sb.toString();
        String[] splits = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < splits.length; i++) {
            list.add(Integer.parseInt(splits[i]));
        }
        Collections.sort(list);
        System.out.println(list);
        //写出数据
        FileWriter fw = new FileWriter("b.txt");
        for (int i = 0; i < list.size()-1; i++) {
            fw.write(list.get(i) + "-");
        }
        fw.write(list.get(list.size()-1) +"");//不加""变成字符串会当作整形再根据码表查询
        fw.close();
        fr.close();
    }
}
