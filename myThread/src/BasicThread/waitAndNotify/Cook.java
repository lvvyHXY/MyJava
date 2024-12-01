package BasicThread.waitAndNotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{


    @Override
    public void run() {
        while(true){
        synchronized (Desk.lock){
            if(Desk.count==0){
                break;
            }else {
                if(Desk.foodFlag == 1){
                    //有就等待
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    //没有就制作并叫醒
                    System.out.println("厨师制作了一碗面条");
                    Desk.foodFlag = 1;
                    //唤醒
                    Desk.lock.notifyAll();
                }
            }
        }
        }
    }
}
