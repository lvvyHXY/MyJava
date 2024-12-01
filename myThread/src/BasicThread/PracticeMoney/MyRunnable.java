package BasicThread.PracticeMoney;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    //红包金额：100
    static double money = 100;
    //最少抢到0.01元
    static final double MIN_MONEY = 0.01;
    //人数限额3（三个包）
    static int count = 3;
    //锁
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
            synchronized (this) {
                if (count == 0) {
                    System.out.println(Thread.currentThread().getName() + "没有抢到红包！");
                } else {
                    double prize = 0;
                    //三种情况不一样
                    if (count == 1) {
                        prize = money;
                        System.out.println(Thread.currentThread().getName() + "抢到了" + prize + "元");
                    } else {
                        Random r = new Random();
                        double bounds = money - (count - 1) * MIN_MONEY;
                        prize = r.nextDouble(bounds);
                        if (prize < MIN_MONEY) prize = MIN_MONEY;
                    }
                    //红包减一
                    count--;
                    //更新钱
                    money = money - prize;
                    System.out.println(Thread.currentThread().getName() + "抢到了" + prize + "元");
                }
            }
        }
    }
