package Lession.ThreadPool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread()+"执行中");
    }
}
