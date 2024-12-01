package BasicThread.Join;

import BasicThread.mythreadFunction.MyThread;

public class joinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread("土豆");
        mt.start();


        //默认会先main线程（概率大些）
        //可以使用join方法插入土豆线程到main线程之前
        mt.join();



        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"@"+i);
        }

    }
}
