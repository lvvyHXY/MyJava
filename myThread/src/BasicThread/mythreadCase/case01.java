package BasicThread.mythreadCase;

public class case01 {
    //通过继承Thread类来实现多线程：重写run方法
    public static void main(String[] args) {
        myThreadD t1 = new myThreadD();
        myThreadD t2 = new myThreadD();
        t1.setName("1");
        t2.setName("2");
        t1.start();
        t2.start();
    }
}
