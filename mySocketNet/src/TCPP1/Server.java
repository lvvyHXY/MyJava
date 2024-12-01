package TCPP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10087);
        Socket accept = ss.accept();
        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
            int b;
            while((b = isr.read()) != -1){
                System.out.print((char) b);
            }

        ss.close();
    }
}
