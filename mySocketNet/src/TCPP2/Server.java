package TCPP2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10089);
        Socket accept = ss.accept();
        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
        int data;
        while((data = isr.read()) != -1){
            System.out.println((char) data);
        }

        //反馈消息
        OutputStream os = accept.getOutputStream();
        os.write("有多好".getBytes());
        accept.close();
        ss.close();

    }
}
