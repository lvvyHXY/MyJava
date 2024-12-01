package ConvertStreamDemo;

import java.io.*;
import java.nio.charset.Charset;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //新办法：直接在构造方法中指定编码规则
        FileReader fr = new FileReader("D:\\src\\a.txt", Charset.forName("GBK"));//第二个参数指定编码规则
        int data;
        while((data = fr.read()) != -1){
            System.out.print((char)data);
        }
        fr.close();
        //老办法
        //字节流转字符流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\src\\a.txt"),"GBK");
        int ch;
        while((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        isr.close();
    }
}
