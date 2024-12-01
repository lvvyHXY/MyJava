package ConvertStreamDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Demo3 {
    //指定编码规则的读写
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\src\\a.txt", Charset.forName("GBK"));
        int data;
        FileWriter fw = new FileWriter("d.txt",Charset.forName("UTF-8"));
        while((data = fr.read()) != -1){
            fw.write(data);
        }
        fw.close();
        fr.close();

    }
}
