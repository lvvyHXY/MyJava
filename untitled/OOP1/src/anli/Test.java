package anli;

import java.util.Scanner;

public class Test {
    //用面向对象实现智能家居控制系统
    //角色：设备
    //功能：开关
    //谁控制他们：单例对象：智能控制系统
    //1.创建设备对象
    //2.放入数组中代表整个家庭的家电
    public static void main(String[] args) {
        JD[] jds = new JD[4];
        jds[0] = new TV("小米电视",false);
        jds[1] = new WashMACHINE("美的洗衣机",false);
        jds[2] = new AirConditioner("格力空调",false);
        jds[3] = new Lantern("LED灯",false);
    //3.创建智能控制系统对象
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        //控制电视机
        //smartHomeControl.control(jds[0]);
        //提示用户操作：a。展示所有设备当前情况b。让用户选择设备进行操作

        while (true) {
            smartHomeControl.printAllStatus(jds);
            System.out.println("请输入您要控制的设备:");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("退出d");
                    return;
                    default:
                        System.out.println("输入有误，请重新输入");
            }
        }

    }
}
