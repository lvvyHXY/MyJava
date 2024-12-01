package PrintStreamDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo2 {
    //带缓冲区
    public static void main(String[] args) throws IOException {
        //打开自动刷新，不然是装入缓冲区，一般缓冲区装满了之后才会刷新到文件中
        PrintWriter pw = new PrintWriter(new FileWriter("a3.txt"),true);
        pw.println("1234567");
        pw.print("爱上你了对不起");
        pw.printf("%s","aaaaaaa");
        pw.close();
    }
}
