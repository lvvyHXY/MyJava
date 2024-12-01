package BasicThread.tongbukuai;

public class TongBuDaiMaKUAI {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        my1.setName("窗口1");
        MyThread my2 = new MyThread();
        my2.setName("窗口2");
        MyThread my3 = new MyThread();
        my3.setName("窗口3");

        my1.start();
        my2.start();
        my3.start();
    }
}
