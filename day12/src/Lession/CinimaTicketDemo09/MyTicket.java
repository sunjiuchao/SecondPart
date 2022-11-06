package Lession.CinimaTicketDemo09;

import java.util.IdentityHashMap;


public class MyTicket implements Runnable {
    private int ticketCount = 100;

    @Override
    public void run() {//实现买票的过程
        while (true){
            if (ticketCount == 0) {
                break;//票买完，线程停止

            }else {//可以买票，哪个窗口卖的
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticketCount--;
                System.out.println(Thread.currentThread().getName()+"正在买票,还剩余票数："+ticketCount);
            }
        }
    }
}
