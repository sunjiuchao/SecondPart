package Study.TaskRejectionPolicy;

import Study.ThreadPoolDemo01.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * //    参数一：核心线程数量           corePoolSize：     核心线程的最大值，不能小于0
 * //    参数二：最大线程数             maximumPoolSize： 最大线程数，不能小于等于0，maximumPoolSize >= corePoolSize
 * //    参数三：空闲线程最大存活时间     keepAliveTime：   空闲线程最大存活时间,不能小于0
 * //    参数四：时间单位               unit：            时间单位
 * //    参数五：任务队列               workQueue：       任务队列，不能为null
 * //    参数六：创建线程工厂            threadFactory：   创建线程工厂,不能为null
 * //    参数七：任务的拒绝策略           handler：         任务的拒绝策略,不能为null
 */
public class Test01 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                2,                                   //空闲线程最大存活时间
                TimeUnit.SECONDS, //(秒)                         //时间单位
                new ArrayBlockingQueue<>(10),            //任务队列
                Executors.defaultThreadFactory(),               //创建线程工厂
                new ThreadPoolExecutor.AbortPolicy());          //任务的拒绝策略
        //AbortPolicy丢弃任务并抛出RejectedExecutionException异常。是默认的策略。
        for (int i = 0; i < 15; i++) {                          //池子中最大线程数量，加上队列中等待线程的容量时，就会拒绝任务
            pool.submit(new MyRunnable());
        }
        pool.shutdown();
    }
}
