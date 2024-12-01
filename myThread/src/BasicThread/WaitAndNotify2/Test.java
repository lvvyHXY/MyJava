package BasicThread.WaitAndNotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        //创建阻塞队列,容量为1
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        //创建线程
        Cook c = new Cook(queue);
        foodie f = new foodie(queue);
        //启动
        c.start();
        f.start();

    }
}
