package Get;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        //可以通过IP地址或者机器的名字获取对象，是IPV4返回4，6返回IPV6对象
        InetAddress address = InetAddress.getByName("hxy");
        System.out.println(address);//hxy/10.83.167.80
        //获取当前IP地址的主机名
        System.out.println(address.getHostName());
        //返回IP地址字符串
        System.out.println(address.getHostAddress());

    }
}
