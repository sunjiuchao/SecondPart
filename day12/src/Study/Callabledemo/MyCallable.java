package Study.Callabledemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
//        和runnable区别就是有返回值
//        泛型就是返回值的类型
        for (int i = 0; i < 100; i++) {
            System.out.println("循环"+i);
        }
        return "secssed";
    }
}
