package Lession.EG;

public class Cook extends Thread {

    /*
    1,判断桌子上是否有汉堡
        如果有,就等待,没有就生成
     2,生成完毕之后,要把汉堡放在桌子上
     3,叫醒消费者
     */
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else {
                    if(Desk.flag == false){
                        //说明桌子上没有汉堡了,需要生产
                        System.out.println("厨师正在生成汉堡");
                        //还需要把汉堡放在桌子上
                        Desk.flag = true;
                        //叫醒消费者
                        Desk.lock.notifyAll();
                    }else {
                        //说明桌子上还有,进入等待状态
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
