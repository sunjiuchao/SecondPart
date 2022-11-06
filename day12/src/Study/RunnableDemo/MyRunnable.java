package Study.RunnableDemo;

public class MyRunnable extends Thread implements Runnable {
    public MyRunnable() {
        super();
    }

    public MyRunnable(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---"+i);//当前线程对象
        }
    }
}
