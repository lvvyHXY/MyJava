package BasicThread.PracticeMoney;

public class Test {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        Thread t4 = new Thread(mr);
        Thread t5 = new Thread(mr);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
