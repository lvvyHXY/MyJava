package BasicThread.Daemon;

public class DaemonDemo {
    public static void main(String[] args) {
        //非守护线程结束时，守护线程会陆陆续续结束,并不是直接结束
        MyThread1 t1 = new MyThread1("非守护");
        MyThread2 t2 = new MyThread2("备胎");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
