package BasicThread.mythreadCase;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            /*Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"Hello World");*/
            System.out.println(Thread.currentThread().getName() + "HW");
        }
    }
}
