package BufferdInputStreamDemo;

import java.io.*;

public class BufferedRW {
    public static void main(String[] args) throws IOException {
        //字符输入输出流
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt",true));//打开续写开关
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();//跨平台换行，Windows：\r\n，Linux：\n，Mac：\r
        }
        bw.close();
        br.close();
    }
}
