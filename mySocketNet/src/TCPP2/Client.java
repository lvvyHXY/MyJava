package TCPP2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10089);

        OutputStream os = socket.getOutputStream();
        os.write("你好".getBytes());
        //关流，结束标记，不然读取方会再读取的while里卡死
        socket.shutdownOutput();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while((b = isr.read()) != -1){
            System.out.println((char) b);
        }

        socket.close();
    }
}
