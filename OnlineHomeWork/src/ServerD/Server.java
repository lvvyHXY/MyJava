package ServerD;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {

    //在server中定义一个集合存放登陆进来的所有数据的Socket
    static ArrayList<Socket> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        /*ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                6,
                3,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );*/
        //读取文件中的账号密码，放入集合（Properties）
        //之后监测就用prop.containsKey啥的就行


        ServerSocket ss = new ServerSocket(10099);
        //1.把本地文件中正确的用户名和密码获取到
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("D:\\Java\\OnlineHomeWork\\users\\account.txt");
        prop.load(fis);
        fis.close();

        //2.只要来了一个客户端，就开一条线程处理
        while (true) {
            Socket socket = ss.accept();
            System.out.println("有客户端来链接");
            new Thread(new MyRunnable(socket, prop)).start();
        }


    }
}