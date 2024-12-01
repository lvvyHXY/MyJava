package TCPP1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10087);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入：");
            String str = sc.nextLine();
            os.write(str.getBytes());
            if(str.equals("886")){
                break;
            }
        }
        socket.close();
    }
}
