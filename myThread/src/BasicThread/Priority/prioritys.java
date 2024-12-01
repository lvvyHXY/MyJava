package BasicThread.Priority;

import BasicThread.mythreadFunction.MyThread;

public class prioritys {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread("飞机");
        Thread t2 = new Thread("坦克");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        //优先级从1-10，越大抢占的概率越高
    }
}
