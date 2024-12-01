package BasicThread.ThreadPool.Creation;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        //无限大线程池
       // ExecutorService poo1 = Executors.newCachedThreadPool();
        //有限大
        ExecutorService poo2 = Executors.newFixedThreadPool(3);

        //提交任务
     //   poo1.submit(new MyRunnable());
     //   poo1.submit(new MyRunnable());
     //   poo1.submit(new MyRunnable());
     //   poo1.submit(new MyRunnable());
     //   poo1.submit(new MyRunnable());
        //自定义大小的池子多于线程个数的任务会排队
            poo2.submit(new MyRunnable());
            poo2.submit(new MyRunnable());
            poo2.submit(new MyRunnable());
            poo2.submit(new MyRunnable());
        //销毁（一般不消毁）
      //  poo1.shutdown();
    }
}
