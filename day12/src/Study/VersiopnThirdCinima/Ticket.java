package Study.VersiopnThirdCinima;

public class Ticket implements Runnable {
    //锁对象必须是同一个
    private static int ticket = 100;//static开启数据共享，防止重复使用
    private Object obj = new Object();
    @Override
    public void run() {
        //1、同步代码块：可以锁住指定的代码体，和指定锁对象
        //  synchronized（对象）{
        //  代码体
        //  }

        //2、同步方法：可以锁住方法中所有的代码体，不能指定锁对象
        //  修饰符 synchronized 返回值类型 方法名（参数）
        //
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
