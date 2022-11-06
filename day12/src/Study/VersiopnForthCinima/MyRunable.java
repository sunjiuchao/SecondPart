package Study.VersiopnForthCinima;

public class MyRunable implements Runnable {

    private int ticketCount  = 100;

    @Override
    public void run() {//验证同步方法的锁对象为this
        while (true){

            if ("窗口一".equals(Thread.currentThread().getName())){
                //同步方法
                boolean result = synchronizedMethod();
            }


            if ("窗口二".equals(Thread.currentThread().getName())){
                //同步代码块
                synchronized (this){
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

    private synchronized boolean synchronizedMethod() {
        if (ticketCount == 0){
            return true;
        }else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + ":在买票，剩余票数:" + ticketCount);
            return false;
        }
    }
}
