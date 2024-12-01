package BasicThread.Practice1;

import BasicThread.Practice2.MyRunnable;
import BasicThread.mythreadCase.MyRun;

public class Test {
    public static void main(String[] args) {
        //创建Myrunnable对象
        //创建线程对象
        //启动线程
        //我测，第一题的test改成第二题的了，注意
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}
