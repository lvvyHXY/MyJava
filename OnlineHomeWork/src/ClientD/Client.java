package ClientD;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10099);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));



        while (true) {
            System.out.println("服务器已经连接成功\n" +
                    "==============欢迎来到黑马聊天室================\n" +
                    "1登录\n" +
                    "2注册\n" +
                    "请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch(choose){
                case 1 -> login(bw,socket);
                case 2 -> System.out.println("点击了注册");
                default -> System.out.println("没有此选项");
            }
        }

    }

    public static void login(BufferedWriter bw,Socket socket) throws IOException {
        //获取输出流

        //键盘录入
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String nameInput = sc.nextLine();
        System.out.println("请输入密码");
        String passwordInput = sc.nextLine();


        //然后把用户名密码传进去
        StringBuilder sb = new StringBuilder();
        String data = sb.append("username=").append(nameInput).append("&password=").append(passwordInput).toString();
        //传给服务器端操作,我要登陆
        bw.write("login");
        bw.newLine();
        bw.flush();
        //第二次传用户名和密码
        bw.write(data);
        bw.newLine();
        bw.flush();

        //读取回写的内容
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String backs = br.readLine();
        if(backs.equals("1")){
            System.out.println("登陆成功");
            System.out.println("开始聊天吧");
            //开一条单独的线程，专门用来接收服务端发送过来的聊天记录
            new Thread(new ClientMyRunnable(socket)).start();
            //开始聊天
            talk2All(bw);
        } else if (backs.equals("2")) {
            System.out.println("密码错误");
        }else {
            System.out.println("用户名不存在");
        }

    }
    //往服务器写出消息
    private static void talk2All(BufferedWriter bw) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要说的话");
            String str = sc.nextLine();
            //把聊天内容写给服务器
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }
}