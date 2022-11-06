package Lession.CachePool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachePoolDemo01 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(
                ()->{
                    System.out.println(Thread.currentThread().getName()+"1111");
                }
        );

        executorService.submit(
                ()->{
                    System.out.println(Thread.currentThread().getName()+"2222");
                }
        );
        executorService.shutdown();
    }
}
