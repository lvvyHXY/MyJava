package UDP;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象（快递公司）
        DatagramSocket ds = new DatagramSocket();
        //打包数据:byte数组，长度，地址，端口号
        String str = "南音";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);
        //发送数据
        ds.send(dp);
    }
}
