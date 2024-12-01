package BasicThread.Lock;

import BasicThread.tongBuMethod.MyRunnable;

public class lockDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.setName("窗口1");
        Thread t2 = new Thread(mr);
        t2.setName("窗口2");
        Thread t3 = new Thread(mr);
        t3.setName("窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
