package BufferdInputStreamDemo;

import java.io.*;

public class construction {
    // BufferedInputStream(InputStream in) 默认缓冲区为8192的字节数组
    // BufferedInputStream(InputStream in,int size) 手动设定缓冲区大小
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));//创建对象时参数要创建输入流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"));//创建对象时参数要创建输出流对象
        //一次读取多个，单个不用byte数组就行
        byte[] b = new byte[1024];
        int len;
        while((len = bis.read(b)) != -1){
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
    }
}
