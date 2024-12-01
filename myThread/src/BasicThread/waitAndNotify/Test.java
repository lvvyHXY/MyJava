package BasicThread.waitAndNotify;

public class Test {
    public static void main(String[] args) {
        Cook c= new Cook();
        foodie f = new foodie();
        c.setName("厨师");
        f.setName("吃货");
        c.start();
        f.start();
    }
}
