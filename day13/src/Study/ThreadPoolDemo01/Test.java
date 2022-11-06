package Study.ThreadPoolDemo01;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * 线程池的好处
 * 1.降低了资源的消耗
 * 2.提高了响应的速度
 * 3.提供附加功能
 * 	static ExecutorService newCachedThreadPool()   创建一个默认的线程池
 *  static newFixedThreadPool(int nThreads)	   创建一个指定最多线程数量的线程池
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
//        Executors 创建 线程池对象
//        ExecutorService 控制 线程             池对象
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"正在执行");
        });

        Thread.sleep(3000);

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"正在执行");
        });

        executorService.shutdown();

    }
}
