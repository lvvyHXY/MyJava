package BasicThread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    static int tickets = 0;
    //创建锁对象,确保唯一即可
    static Lock lock = new ReentrantLock();//因为MyThread会创建多个对象，所以要用static修饰
    @Override
    public void run() {
        while(true){
            //一般写本类的字节码文件对象（唯一）
            lock.lock();//加锁
            try{
                if(tickets<100){
                    //加锁，默认开启，一个线程进入，在进行完同步代码块中代码后其他的才能进入
                    //锁要写在循环里面，不然2，3只有循环进行完才能出来
                        Thread.sleep(100);
                    tickets++;
                    System.out.println(getName()+"正在卖第"+tickets+"张票!!");
                }else break;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();//在finally中解锁，确保跳出循环后还能解锁，让程序结束
            }
        }




    }
}
