package Lession.TicketCynDemo11;


/**
 * 同步代码块：锁住指定的代码
 * 解决安全性问题，重复，负数票
 */
public class MyTicket implements Runnable {
    private static int ticketCount = 100;
//    解决方法一：同步代码块 synchronized(obj){   }  创建唯一的锁对象
    @Override
    public void run() {//实现买票的过程
        while (true) {
            //同步方法
            if ("窗口一".equals(Thread.currentThread().getName())) {
                boolean result = synchronizedMethod();
                if (result == true){
                    break;//卖完了
                }
            }
            //同步代码块
            if ("窗口二".equals(Thread.currentThread().getName())) {
                synchronized (MyTicket.class) {
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
                }
            }
        }
        /**
         * 同步方法的锁对象：this
         * ================================
         * 静态同步方法的锁对象：类名，class
         * ================================
         */
    }
    public static synchronized boolean synchronizedMethod(){
        if (ticketCount == 0) {
            return true;//票买完，线程停止
        } else {//可以买票，哪个窗口卖的
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + "正在买票,还剩余票数：" + ticketCount);
            return false;
        }
    }
}
