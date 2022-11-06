package Study.ThreadPoolDemo01;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" --> 正在执行");
    }
}
