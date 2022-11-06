package Lession.CallableDemo03;

import java.util.concurrent.Callable;
//Callable接口泛型需要和重写的call方法的返回值类型相同
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            System.out.println("请假："+i);
        }
        return "好吧";
    }
}
