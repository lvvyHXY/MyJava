package BasicThread.Yield;

public class Demo {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("飞机");
        Mythread t2 = new Mythread("坦克");
        t1.start();
        t2.start();
    }
}
