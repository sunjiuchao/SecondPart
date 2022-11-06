package Homework.Cousumer;

public class Fooder extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else {
                    if (Desk.flag == true){//有汉堡
                        System.out.println("徐傲正在吃面包！");
                        //吃汉堡，状态变成false,汉堡数量减一
                        Desk.flag = false;
                        Desk.lock.notifyAll();
                        Desk.count--;
                    }else {
                        //没有汉堡就等，让厨师做完再吃
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
