package Homework.Cousumer;

public class Cooker extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else {
                    if (Desk.flag == false){//没有汉堡->生产
                        System.out.println("厨师正在做汉堡！");
                        Desk.flag = true;//放桌子上
                        Desk.lock.notifyAll();//叫醒其他所有线程
                    }else {//桌上有汉堡是，等吃完再叫醒厨师
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
