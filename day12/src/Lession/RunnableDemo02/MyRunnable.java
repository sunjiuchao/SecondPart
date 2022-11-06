package Lession.RunnableDemo02;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //run是线程启动后要执行的代码
        //
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
