package Study.Test01.DaemonDemo02;

public class MyThread1 extends Thread{
    public MyThread1() {
        super();
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
