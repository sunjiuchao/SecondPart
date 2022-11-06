package Lession.SetDaemonDemo08;

public class Test {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
//        把保镖线程设置为保护线程,他会守护其他所有的线程
        th1.setName("主人");
        th2.setName("保镖");
        th2.setDaemon(true);

        th1.start();
        th2.start();
    }
}
