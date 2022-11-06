package Lession.FixPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixPoolDemo01 {
    public static void main(String[] args) {
        //static ExecutorService newFixedThreadPool(int nThreads) : 创建一个指定最多线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor pool = (ThreadPoolExecutor)executorService;
        System.out.println(pool.getPoolSize());
        executorService.submit(
                ()->{
                    System.out.println(Thread.currentThread()+"111");
                }
        );

        executorService.submit(
                ()->{
                    System.out.println(Thread.currentThread()+"222");
                }
        );

        executorService.submit(
                ()->{
                    System.out.println(Thread.currentThread()+"333");
                }
        );
        System.out.println(pool.getPoolSize());
        executorService.shutdown();
    }
}
