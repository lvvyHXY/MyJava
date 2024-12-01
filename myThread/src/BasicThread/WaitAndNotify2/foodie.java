package BasicThread.WaitAndNotify2;

import BasicThread.waitAndNotify.Desk;

import java.util.concurrent.ArrayBlockingQueue;

public class foodie extends Thread{
    ArrayBlockingQueue<String> queue =  new ArrayBlockingQueue<>(1);
    public foodie(){

    }
    public foodie(ArrayBlockingQueue<String> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while(true){
            //吃
            try {
                queue.take();
                System.out.println("拿出一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
