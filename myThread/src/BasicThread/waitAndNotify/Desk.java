package BasicThread.waitAndNotify;

public class Desk {
    //桌子上面条的状态：0：没有；1：有，用int是因为之后可能会有更多条线程需要操控
    public static int foodFlag = 0;
    //最多10碗，让线程停止
    public static int count = 10;
    //创建一个锁对象
    public static Object lock = new Object();
}
