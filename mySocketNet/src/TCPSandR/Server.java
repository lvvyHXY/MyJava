package TCPSandR;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //服务端
        ServerSocket ss = new ServerSocket(10086);
        //等待客户端连接,连上了会返回一个Socket对象
        //这个也是阻塞的
        Socket accept = ss.accept();
        //从输入流获取数据
        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
        int b;
        while((b = isr.read()) != -1){
            System.out.println((char)b);
        }
        isr.close();
        ss.close();
    }
}
