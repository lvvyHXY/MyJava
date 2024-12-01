package BasicThread.mythreadCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class case3 {
    //创建一个类实现Callable接口，重写call方法：特点：可以获取线程运行的结果
    //创建类的对象(表示多线程的任务
    //创建FutureTask类对象，获取运行结果（管理多线程运行的结果
    //创建线程对象
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1
        MyCallable mc = new MyCallable();
        //2
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //3
        Thread t1 = new Thread(ft);
        //启动
        t1.start();
        //获取结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
