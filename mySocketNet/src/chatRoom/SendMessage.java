package chatRoom;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        //发送：键盘录入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入：");
            String str = sc.nextLine();
            byte[] bytes = str.getBytes();
            //目的地
            InetAddress address = InetAddress.getByName("127.0.0.1");//本机
            //端口号（接收端
            int port = 10086;
            //打包数据
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);
            //发送
            ds.send(dp);
            if(str.equals("886")){
                break;
            }
        }
        ds.close();
        System.out.println("会话结束");
    }
}
