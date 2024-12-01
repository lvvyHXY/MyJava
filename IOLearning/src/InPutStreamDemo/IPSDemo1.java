package InPutStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IPSDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象时文件不存在会直接报错
        FileInputStream fis = new FileInputStream("a.txt");
        //注意，当没有东西可读时，返回-1
        //一次只读一个字节，返回ASCII码表上对应的值
        int b1 = fis.read();
        System.out.println(b1);
        int b2 = fis.read();
        System.out.println(b2);
        int b3 = fis.read();
        System.out.println(b3);
        //每次用完记得释放
        fis.close();

    }
}
