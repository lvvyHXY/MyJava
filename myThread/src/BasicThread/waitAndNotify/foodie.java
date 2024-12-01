package BasicThread.waitAndNotify;

public class foodie extends Thread{
    //看桌上是否有面条
    //有：吃，count--，唤醒厨师
    //无：等待
    //10碗后结束

    @Override
    public void run() {
        //写循环，写同步代码块，可以抽象出同步方法
        while(true){
           synchronized (Desk.lock){
               if(Desk.count==0){
                   break;
               }else {//没吃饱
                   if(Desk.foodFlag == 0){
                       //没有,用锁对象调用wait，将线程与锁对象绑定，这样就知道唤醒谁
                       try {
                           Desk.lock.wait();
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }else {
                       //吃，吃完唤醒厨师
                       System.out.println("正在吃第"+(10-Desk.count+1)+"碗面");
                       Desk.count--;
                       //修改桌子状态
                       Desk.foodFlag = 0;
                       //唤醒
                       Desk.lock.notifyAll();

                   }
               }
           }
        }
    }
}
