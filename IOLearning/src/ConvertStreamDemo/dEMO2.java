package ConvertStreamDemo;

import java.io.*;
import java.nio.charset.Charset;

public class dEMO2 {
    public static void main(String[] args) throws IOException {
        //JDK11前，字节流转字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d.txt"),"GBK");
        osw.write("你好你好");
        osw.close();
        //
        FileWriter fw = new FileWriter("d.txt", Charset.forName("UTF-8"));
        fw.write("你好你好");
        fw.close();
    }
}
