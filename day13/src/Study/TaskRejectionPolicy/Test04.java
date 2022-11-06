package Study.TaskRejectionPolicy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test04 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                2,
                2,                                   //空闲线程最大存活时间
                TimeUnit.SECONDS, //(秒)                         //时间单位
                new ArrayBlockingQueue<>(1),            //任务队列
                Executors.defaultThreadFactory(),               //创建线程工厂
                new ThreadPoolExecutor.CallerRunsPolicy());          //任务的拒绝策略
        /*
         CallerRunsPolicy,调用任务的run()方法绕过线程池直接执行。
         多的任务交给其他线程执行
         */
        for (int i = 0; i <= 5; i++) {                          //池子中最大线程数量，加上队列中等待线程的容量时，就会拒绝任务
            int s = i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"-->"+s);
            });
        }
        pool.shutdown();
    }
}
