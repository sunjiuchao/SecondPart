package Lession.ZLastConsumer;

public class Foodie extends Thread {
    /**
     * 1.是否有汉堡
     * 2.没有就等
     * 3.有就吃
     * 4.吃完之后，桌子上汉堡没有了
     * 5.叫醒生产者
     * 6.汉堡总数量减一
     */
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                //判断
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.flag == true){
                        //有汉堡
                        System.out.println("顾客正在吃汉堡");
                        //桌子上的被吃了
                        Desk.flag = false;
                        //唤醒厨师线程
                        Desk.lock.notifyAll();
                        //汉堡总数量减一
                        Desk.count--;
                    }else {
                        //没有汉堡,让消费者等待wait()
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

    }
}
