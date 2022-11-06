package Lession.ThreadPool;

import Study.ThreadPoolDemo01.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TreadPool {
    public static void main(String[] args) {
        //ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
        //(核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);
        //    参数一：核心线程数量
        //    参数二：最大线程数
        //    参数三：空闲线程最大存活时间
        //    参数四：时间单位
        //    参数五：任务队列
        //    参数六：创建线程工厂
        //    参数七：任务的拒绝策略

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),           //创建默认的线程对象
                new ThreadPoolExecutor.DiscardOldestPolicy()        //拒绝策略，超过(最大线程数+任务队列数量) 推荐
                /*
                ThreadPoolExecutor.AbortPolicy: 		    丢弃任务并抛出RejectedExecutionException异常。是默认的策略。推荐使用
                ThreadPoolExecutor.DiscardPolicy： 		    丢弃任务，但是不抛出异常 这是不推荐的做法。
                ThreadPoolExecutor.DiscardOldestPolicy：    抛弃队列中等待最久的任务 然后把当前任务加入队列中。
                ThreadPoolExecutor.CallerRunsPolicy:        调用任务的run()方法绕过线程池直接执行。
                */

        );
        for (int i = 0; i <= 16; i++) {
            final int num = i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"---"+num);
            });
        }
        pool.shutdown();
    }
}
