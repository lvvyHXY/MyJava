package ZiFuStream;

import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        FileReader fr = new FileReader("a.txt");
        //循环读取数据
        //read() :一次读取一个字节，遇到中文会一次读取多个字节
        //读取之后会解码变成十进制数并且返回
        //这个十进制数就是字符集上的码
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        //释放资源
        fr.close();
    }
}
