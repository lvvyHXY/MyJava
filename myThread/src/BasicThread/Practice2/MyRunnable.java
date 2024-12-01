package BasicThread.Practice2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{
    static int present = 100;
    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            lock.lock();
            try {
                if(present <=10){
                    break;
                }else {
                    present--;
                    System.out.println(Thread.currentThread().getName()+"送出了礼物，还剩个"+present+"礼物");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
