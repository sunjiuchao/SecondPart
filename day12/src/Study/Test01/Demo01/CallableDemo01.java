package Study.Test01.Demo01;

import java.util.concurrent.Callable;

public class CallableDemo01 implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
        return "完毕";
    }
}
