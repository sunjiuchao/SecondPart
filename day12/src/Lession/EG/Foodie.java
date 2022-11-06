package Lession.EG;

public class Foodie extends Thread {

/*
    1,判断桌子上是否有汉堡
    2,如果没有就等待
    3,如果有就开吃
    4,吃完之后,桌子上的汉堡就没有了
                叫醒生产者继续生产
      汉堡的总数量要减一
 */
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else {
                    if(Desk.flag == true){
                        //有汉堡
                        System.out.println("吃货正在吃汉堡");
                        //代表吃完了汉堡,桌子上就没有了
                        Desk.flag = false;
                        //唤醒厨师线程
                        Desk.lock.notifyAll();

                        //汉堡的总数量要减一
                        Desk.count--;
                    }else {
                        //没有汉堡,就等待,让消费者进入等待状态
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
