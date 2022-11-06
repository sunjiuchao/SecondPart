package Study.Cinima;

import java.util.Objects;

public class Ticket implements Runnable {
    /**
     * 多个线程同时操作一个共享数据造成数据重复||负数票
     * 解决方法，让线程依次执行，把能够共享数据的代码锁死
     * 任意时刻只有一个线程可以执行即可
     *
     * synchronized{
     * 任意对象，多条语句操作共享数据的代码
     * }
     *
     * 默认情况下是打开的，只要有一个线程抢占位置，就会锁死
     * 当线程执行完毕后，就会自动解锁
     *
     * 多个线程必需使用同一把锁
     * 好处：解决了多线程数据的安全性
     * 弊端：线程数量多时，每个线程都会判断同步上的锁，耗费资源，降低了执行的效率
     */
    private int ticket = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj){
                if (ticket == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + ":在买票，剩余票数:" + ticket);
                }
            }
        }
    }
}
