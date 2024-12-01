package Practice;

import java.io.*;

public class BufferT3 {
    public static void main(String[] args) throws IOException {
        //实现程序使用次数记录功能，只能用三次，用语句输出展示即可
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        int count = Integer.parseInt(br.readLine());
        count++;
        if (count<=3)
        System.out.println("这是程序的第"+count+"次运行");
        else
        System.out.println("免费次数以用完，请付费后使用");
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        bw.write(count + "");
        bw.close();
        br.close();
    }
}
