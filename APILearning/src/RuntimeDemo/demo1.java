package RuntimeDemo;

import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //获取Runtime对象
        Runtime runtime1 = Runtime.getRuntime();
        //exit
        //runtime1.exit(0);
       // Runtime.getRuntime().exit(0);
        //cpu线程数
        System.out.println(runtime1.availableProcessors());
        //内存
        //已经获取的总内存
        System.out.println(runtime1.totalMemory()/1024/1024);
        //电脑总内存
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        //剩余内存
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        //cmd命令
        Runtime.getRuntime().exec("notepad");
    }
}
