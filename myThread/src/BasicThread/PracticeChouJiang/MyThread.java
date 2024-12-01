package BasicThread.PracticeChouJiang;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    ArrayList<Integer> list = new ArrayList<>();

    public MyThread(){
        super();
    }

    public MyThread(ArrayList<Integer> list){
        super();
        this.list = list;
    }
    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(list.size() == 0){
                    break;
                }else {
                    Collections.shuffle(list);
                    System.out.println(getName()+"产生了一个"+list.get(0) +"元大奖");
                    list.remove(0);
                }
            }
            //sleep放外面可以让线程分布更均匀
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
