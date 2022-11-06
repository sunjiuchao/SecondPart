package Study.Test01.DaemonDemo02;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 后台线程/守护线程（备胎线程）
         * public final void setDaemon(boolean on) : 设置守护线程
         *
         */
        MyThread1 m1 = new MyThread1("第一线程");
        MyThread1 m2 = new MyThread1("第二线程");
//        把第二线程设置为守护线程，当普通线程执行完毕之后，守护线程就不必执行了，但不会立即结束，抢占CPU速度影响
        m2.setDaemon(true);

        m1.start();
        m2.start();

    }
}
