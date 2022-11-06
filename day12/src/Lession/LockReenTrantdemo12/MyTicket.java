package Lession.LockReenTrantdemo12;

import java.util.concurrent.locks.ReentrantLock;
/**
 * 同步代码块：锁住指定的代码
 * 解决安全性问题，重复，负数票
 */
public class MyTicket implements Runnable {
    private static int ticketCount = 100;

    ReentrantLock lock = new ReentrantLock();
    //    解决方法一：同步代码块 synchronized(obj){   }  创建唯一的锁对象
    @Override
    public void run() {//实现买票的过程
        while (true) {
            try {
                lock.lock();
                if (ticketCount == 0) {
                    break;//票买完，线程停止
                } else {//可以买票，哪个窗口卖的
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "正在买票,还剩余票数：" + ticketCount);
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
