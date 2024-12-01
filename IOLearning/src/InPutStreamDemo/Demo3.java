package InPutStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");
        int b;
        long time1 = System.currentTimeMillis();
        //拷贝原理就是边读边写,但是此处一次读一个字节，对于大文件太慢了
        while((b = fis.read()) != -1){
            fos.write(b);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        //先开始的后关闭
        fos.close();
        fis.close();
    }
}
