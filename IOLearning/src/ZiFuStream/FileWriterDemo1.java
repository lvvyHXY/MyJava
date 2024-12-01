package ZiFuStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    //write(int c)  (String str)  (String str,int start,int end) (char[] chars) (char[] chars,int start,int end)
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("b.txt");
        fw.write(26879);
        fw.write("顺顺顺");
        fw.write("你好");
        fw.write("\r\n");
        char[] chars = {'a','b','c','d','e'};
        fw.write(chars);
        fw.close();
    }
}
