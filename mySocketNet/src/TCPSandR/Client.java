package TCPSandR;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象，传入主机地址和端口号
        //创建时会连接，不然会报错
        //三次握手保证连接建立
        Socket s = new Socket("127.0.0.1",10086);
        //链接输出流发送数据
        OutputStream os = s.getOutputStream();
        os.write("你好".getBytes());
        //释放资源
        //四次挥手保证数据处理完了再关闭通道
        os.close();
        s.close();

    }

}
