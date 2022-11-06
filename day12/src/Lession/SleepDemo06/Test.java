package Lession.SleepDemo06;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyRannable mr = new MyRannable();
        Thread th1 = new Thread(mr);
        Thread th2 = new Thread(mr);
        th1.setName("First");
        th2.setName("Second");
        th1.start();
        th2.start();
    }
}
