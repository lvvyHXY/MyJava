package BasicThread.tongBuMethod;

public class MyRunnable implements Runnable {
    int tickets = 0;

    @Override
    public void run() {
        while (true) {
            {
                //此处只会创建一个MyRunnable对象，线程传入的参数是它
                if (sold())
                    break;
            }
            //放里面的话能被抢到吗？

        }
    }

    private synchronized boolean sold() {
        if (tickets == 100) {
            return true;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            tickets++;
            System.out.println(Thread.currentThread().getName() + "正在卖第:" + tickets + "张票!");
        }
        return false;
    }
}
