package BasicThread.Practice1;

public class MyRunnable implements Runnable{
    static int count = 1000;
    //static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(count == 0){
                    break;
                }else {
                    try {
                        Thread.sleep(300);
                        count--;
                        System.out.println(Thread.currentThread().getName()+"卖出了第"+(1000-count+1)+"张票，还剩"+count+"张票");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
