package BasicThread.mythreadCase;

public class myThreadD extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++) {
            System.out.println("线程"+getName() +"执行了");
        }
    }
}
