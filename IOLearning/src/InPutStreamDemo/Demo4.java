package InPutStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        byte[] bytes = new byte[2];
        int len1 = fis.read(bytes);//返回读取到的字节数
        System.out.println(len1);
        String str = new String(bytes,0,len1);
        System.out.println(str);
        int len2 = fis.read(bytes);
        System.out.println(len2);
        str = new String(bytes,0,len2);
        System.out.println(str);
        //如果不用（bytes，0，len）可能会打印错误，因为bytes数组数据只被覆盖了一部分，会打印出ed
        int len3 = fis.read(bytes);
        System.out.println(len3);
        str = new String(bytes,0,len3);
        System.out.println(str);
        fis.close();
        System.out.println("程序结束了");

    }
}
