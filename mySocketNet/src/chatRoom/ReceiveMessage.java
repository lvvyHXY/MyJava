package chatRoom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {
        //接收数据时要指定一下对应接收端口
        DatagramSocket ds = new DatagramSocket(10086);
        //准备好箱子接收数据
        //循环外，dp多次接收会自动覆盖上一次的
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        while (true) {
            //接收
            ds.receive(dp);
            byte[] data = dp.getData();
            String str = new String(data);
            if(str.equals("886")){
                break;
            }
            System.out.println(str);
        }
        ds.close();
    }
}
