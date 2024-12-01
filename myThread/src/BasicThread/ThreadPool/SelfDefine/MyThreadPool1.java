package BasicThread.ThreadPool.SelfDefine;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool1 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程>=0
                6,//最大线程数，所以有3个临时的
                60,//空闲线程最大存活时间（数值
                TimeUnit.SECONDS,//空闲线程最大存活时间（单位，用TimeUnit写
                new ArrayBlockingQueue<>(3),//任务队列,阻塞队列
                Executors.defaultThreadFactory(),//创建线程工厂，用Executors的静态方法
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略，是ThreadPoolExecutor的内部类：核心线程满，队伍满时调用临时线程，临时线程也满时触发拒绝策略
        );
        //剩下的就是提交任务了

        //看看JAVA能用多少处理器
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);//所以最大并行数为20
    }
}
