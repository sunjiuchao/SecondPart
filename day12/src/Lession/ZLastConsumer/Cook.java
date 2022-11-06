package Lession.ZLastConsumer;

public class Cook extends Thread{
    /**
     * 1.判断桌子上是否有汉堡（有=》等待 没有=》生成）
     * 2.生成完毕放桌子上
     * 3.叫醒消费者
     *
     */
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else {
                    if (Desk.flag == false){
                        System.out.println();
                        Desk.flag = true;
                    }
                }
            }
        }
    }
}
