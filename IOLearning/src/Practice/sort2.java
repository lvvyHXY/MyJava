package Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class sort2 {
    //文本文件中有 2-1-4-9-6-8
    //将其排序
    public static void main(String[] args) throws IOException {
        //读取文件
        FileReader fr = new FileReader("b.txt");
        StringBuilder sb = new StringBuilder();
        int data;
        while((data = fr.read()) != -1){
            sb.append((char)data);
        }
        //排序   sb.toString().split("-")是一个数组，可以装入stream流，就不用循环了
        Integer[] array = Arrays.stream(sb.toString().split("-")).map(Integer::parseInt).sorted().toArray(Integer[]::new);
        //写出
        FileWriter fw = new FileWriter("c.txt");

        String str = Arrays.toString(array).replace(", ","-");
        String str2 = str.substring(1, str.length() - 1);
        System.out.println(str2);
        fw.write(str2);
        fw.close();
        fr.close();
    }
}
