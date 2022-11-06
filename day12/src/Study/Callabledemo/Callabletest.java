package Study.Callabledemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callabletest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//       创建callable对象参数
        MyCallable mc = new MyCallable();
//        获取线程执行完毕的结果，作为参数穿给Thread
        FutureTask<String> ft = new FutureTask<>(mc);
//        创建线程对象
        Thread thread = new Thread(ft);
//        开始线程
        thread.start();
//        获取线程执行后的返回值
//        在start之前获取不到，线程未开启，get方法会死等
//        get方法会在线程执行完毕才会拿到返回值
        String s = ft.get();
        System.out.println(s);
    }
}
