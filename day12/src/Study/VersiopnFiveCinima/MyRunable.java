package Study.VersiopnFiveCinima;

/**
 * 同步静态方法
 * 方法加static共享
 * 代码块对象用： 当前类的字节码对象
 */
public class MyRunable implements Runnable {

    private static int ticketCount  = 100;

    @Override
    public void run() {//验证同步方法的锁对象为this
        while (true){

            if ("窗口一".equals(Thread.currentThread().getName())){
                //同步方法
                boolean result = synchronizedMethod();
            }


            if ("窗口二".equals(Thread.currentThread().getName())){
                //同步代码块
                synchronized (MyRunable.class){//为了保持锁的一致对象应该也改成class类对象-->当前类的字节码对象
                    if (ticketCount == 0){
                        break;
                    }else {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticketCount--;
                        System.out.println(Thread.currentThread().getName() + ":在买票，剩余票数:" + ticketCount);
                    }
                }
            }
        }

    }

    private static synchronized boolean synchronizedMethod() {
        if (ticketCount == 0){
            return false;
        }else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + ":在买票，剩余票数:" + ticketCount);
            return true;
        }
    }
}
