package Study.LockDemo;

public class Test {
    public static void main(String[] args) {
        //多对象上锁

        Ticket t1 = new Ticket();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t1);

        th1.setName("窗口一");//
        th2.setName("窗口二");

        th1.start();
        th2.start();

    }
}
