package BasicThread.mythreadCase;

import java.util.concurrent.Callable;
//泛型表示线程运行后的返回值
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
