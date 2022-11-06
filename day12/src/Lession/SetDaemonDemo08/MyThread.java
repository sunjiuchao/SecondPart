package Lession.SetDaemonDemo08;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(getName()+"-->"+i);
        }
    }
}
