package BasicThread.Yield;

public class Mythread extends Thread{
    public Mythread() {
        super();
    }

    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"@"+i);

            //调用出让，让线程分布更均匀，出让CPU使用权
            Thread.yield();
        }
    }
}
