package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象，指定接收的端口号
        DatagramSocket ds = new DatagramSocket(10086);

        //创建DatagramPacket,来接收数据，但是构造必须要一个byte数组
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //接收并放入dp
        ds.receive(dp);

        //解析
        byte[] data = dp.getData();
        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        String str = new String(data);
        System.out.println("接收到了来自"+address+"的"+port+"端口的数据："+str);
    }
}
