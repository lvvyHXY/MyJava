package BasicThread.WaitAndNotify2;

import BasicThread.waitAndNotify.Desk;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue =  new ArrayBlockingQueue<>(1);
    public Cook(){
        super();
    }

    public Cook(ArrayBlockingQueue<String> queue) {
        super();
        this.queue = queue;
    }

    @Override
    public void run() {
        //满了就等待，没满就做
        while(true){
            try {
                queue.put("面条");
                //因为打印语句没有写在锁里面，所以它可能会重复打印
                System.out.println("厨师做了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
