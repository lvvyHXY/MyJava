package TCPP3File;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10075);
        //连接
        Socket socket = ss.accept();
        //读取数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //写入服务器文件，写完之后反馈
        //用UUID解决文件名重复问题
        String name = UUID.randomUUID().toString().replaceAll("-", "");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(name+".txt"));
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.flush();

        //反馈
        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("写入服务器完毕");
        bw.newLine();
        bw.flush();//刚刚因为没有刷新缓冲区导致没打印出来

        socket.close();
        ss.close();



    }
}
