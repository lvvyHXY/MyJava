package TCPP3PLUS;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{
    Socket socket;
    MyRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        //读取数据
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(socket.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //写入服务器文件，写完之后反馈
        //用UUID解决文件名重复问题
        String name = UUID.randomUUID().toString().replaceAll("-", "");
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream(name+".txt"));
            byte[] bytes = new byte[1024];
            int len;
            while(true){
                    if (!((len = bis.read(bytes)) != -1)) break;
                    bos.write(bytes,0,len);
            }
            bos.flush();

            //反馈
            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(osw);
                bw.write("写入服务器完毕");
                bw.newLine();
                bw.flush();//刚刚因为没有刷新缓冲区导致没打印出来
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
