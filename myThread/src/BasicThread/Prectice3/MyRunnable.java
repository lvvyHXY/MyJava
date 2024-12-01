package BasicThread.Prectice3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{
    static int number = 1;
    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            lock.lock();
            try {
                if (number <= 100) {
                    if(number % 2 != 0){
                        System.out.println(Thread.currentThread().getName()+"输出了:"+number);
                    }
                    number++;
                }else{
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }
}
