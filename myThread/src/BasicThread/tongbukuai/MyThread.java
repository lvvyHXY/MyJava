package BasicThread.tongbukuai;

import javax.swing.*;

public class MyThread extends Thread{
    static int tickets = 0;
    //创建锁对象,确保唯一即可
    static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            //一般写本类的字节码文件对象（唯一）
            synchronized (MyThread.class){
            if(tickets<100){
                //加锁，默认开启，一个线程进入，在进行完同步代码块中代码后其他的才能进入
                //锁要写在循环里面，不然2，3只有循环进行完才能出来

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tickets++;
                    System.out.println(getName()+"正在卖第"+tickets+"张票!!");
                }else break;
            }
        }


    }
}
