package Study.VersiopnSecondCinima;

public class Ticket implements Runnable {
    //锁对象必须是同一个
    private static int ticket = 100;//static开启数据共享，防止重复使用
    private Object obj = new Object();
    @Override
    public void run() {
        while (true) {//同步代码块
            synchronized (obj){//this代表当前对象
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
