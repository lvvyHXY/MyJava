package InPutStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IPSDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        int b;

        //这里为什么在括号里赋值呢，因为它类似于迭代器，每read一次指针后移一位，所以多次read会导致数据缺漏
        while((b = fis.read()) != -1){
            System.out.println((char)b);
        }

        fis.close();
    }
}
