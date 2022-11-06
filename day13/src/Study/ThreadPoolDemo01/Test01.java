package Study.ThreadPoolDemo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * static ExecutorService newFixedThreadPool(int nThreads) : 创建一个指定最多线程数量的线程池
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        Executors 创建 线程池对象
//        ExecutorService 控制 线程池对象
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize());
        executorService.submit(()->{
            Thread.currentThread().setName("线程池一：");
            System.out.println(Thread.currentThread().getName()+"正在执行");
        });

        Thread.sleep(3000);

        executorService.submit(()->{
            Thread.currentThread().setName("线程池二：");
            System.out.println(Thread.currentThread().getName()+"正在执行");
        });
        System.out.println(pool.getPoolSize());

        executorService.shutdown();

    }
}
