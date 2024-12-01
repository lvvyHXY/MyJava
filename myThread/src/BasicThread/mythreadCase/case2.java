package BasicThread.mythreadCase;

public class case2 {
    //创建一个类实现Runnable接口
    //重写run方法
    //创建我的类的对象
    //创建一个线程对象，传入我创建对象为参数
    public static void main(String[] args) {
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setName("线程1");
        t1.setName("线程2");
        t1.start();
        t2.start();
    }
}
