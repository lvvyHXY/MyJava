package ServerD;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;


public class MyRunnable implements Runnable{
    Properties prop;
    Socket socket;
    MyRunnable(Socket socket,Properties prop){
        this.socket = socket;
        this.prop = prop;
    }
    @Override
    public void run() {
        //接收数据作出反应
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //先看是什么操作
            String choose = br.readLine();
            switch(choose) {
                case "login" -> login(prop);
                case "register" -> System.out.println("注册");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void login(Properties prop) throws IOException {
        //解析传来的 username=***&password=******
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String oralData = br.readLine();
        String[] oral2 = oralData.split("&");
        String usernameInput = oral2[0].split("=")[1];
        String passwordInput = oral2[1].split("=")[1];

            //用户名监测
            if(prop.containsKey(usernameInput)){//用户名对了
                if(passwordInput.equals(prop.get(usernameInput))){
                    writeMessage2Client("1");
                    Server.list.add(socket);//整个服务端的socket都是从客户端接受的，所以这个socket就代表了客户端的某个用户
                    talk2All(br,usernameInput);
                }else{
                    //这里应该是回写错误
                    //抽出一个方法
                    writeMessage2Client("2");
                }
            }else {
                writeMessage2Client("3");
            }
    }

    private void talk2All(BufferedReader br, String username) throws IOException {
        while (true) {
            String message = br.readLine();
            System.out.println(username + "发送过来消息：" + message);

            //群发
            for (Socket s : Server.list) {
                //s依次表示每一个客户端的连接对象
                writeMessage2Client(s, username + "发送过来消息：" + message);
            }
        }
    }
    public  void writeMessage2Client(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
    public void writeMessage2Client(Socket s,String message) throws IOException {
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}
