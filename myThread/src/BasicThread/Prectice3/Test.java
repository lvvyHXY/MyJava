package BasicThread.Prectice3;

public class Test {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.start();
        t2.start();
    }
}
