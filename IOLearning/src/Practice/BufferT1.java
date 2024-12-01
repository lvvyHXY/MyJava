package Practice;

import java.io.*;

public class BufferT1 {
    public static void main(String[] args) throws IOException {
        //统计四种拷贝方式的用时
        long l1 = System.currentTimeMillis();
        //copy1();
        //copy2();
        //copy3();
        copy4();
        long l2 = System.currentTimeMillis();
        System.out.println((l2-l1)/1000 + "秒");
    }
    public static void copy1() throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("a1.txt");
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
    public static void copy2() throws IOException {
                //基本流用数组
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("a1.txt");
        long t11 = System.currentTimeMillis();
        byte[] bytes = new byte[2];
        int len;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        long t12 = System.currentTimeMillis();
        System.out.println(t12-t11);
        fos.close();
        fis.close();
    }
    public static void copy3() throws IOException {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("a1.txt"));
        int b;
        while((b = br.read()) !=-1){
            bw.write(b);
        }
        bw.close();
        br.close();
    }
    public static void copy4() throws IOException {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("a1.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while((len = br.read(bytes)) != -1){
            bw.write(bytes,0,len);
        }
    }
}
