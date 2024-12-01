package TCPP3File;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10075);
        //读取文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        //输出给服务端
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        byte[] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.flush();


        //结束标记
        socket.shutdownOutput();

        //接收服务端反馈
        InputStreamReader isr  = new InputStreamReader(socket.getInputStream());
        int b;
        while((b = isr.read()) !=-1){
            System.out.print((char) b);
        }

        socket.close();

    }
}
