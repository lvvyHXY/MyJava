package BasicThread.mythreadFunction;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        //getName,还可以通过构造方法命名，但是注意自己写的类要重写构造方法调用super因为构造方法不继承
        //setName
        MyThread t1 = new MyThread("damn");
        MyThread t2 = new MyThread("holy");

        //t1.start();
        //t2.start();
        //currentThread:获取当前
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());//当前在运行main线程
        System.out.println("1111111111");
        //sleep，线程休眠多少毫秒
        Thread.sleep(5000);
        System.out.println("222222222222222222");



    }
}
