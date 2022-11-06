package Study.LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 同步代码块和同步方法的对象锁问题，没有直接的看到哪里 上了锁 哪里 释放锁，为了清晰的表达 JDK5之后提供了新的锁对象
 * <p>
 * Lock提供了获得锁和释放锁的方法
 * lock比cynchronize方法由有根广泛的锁操作
 * void lock();//取锁
 * void unlock();//放锁
 * <p>
 * Lock接口不可以直接实例化：使用他的实现类ReentrantLock来实例化
 */
public class Ticket implements Runnable {
    //锁对象必须是同一个
    private static int ticket = 100;//static开启数据共享，防止重复使用
//    private Object obj = new Object();
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//      同步代码块
//      ynchronized (obj){//this代表当前对象
            try {
                lock.lock();
                if (ticket == 0) {
                    break;
                } else {
                    Thread.sleep(100);
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + ":在买票，剩余票数:" + ticket);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

