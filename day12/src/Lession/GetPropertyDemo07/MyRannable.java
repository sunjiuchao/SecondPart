package Lession.GetPropertyDemo07;

public class MyRannable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
