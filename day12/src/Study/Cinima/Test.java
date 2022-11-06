package Study.Cinima;

public class Test {
    public static void main(String[] args) {
        /**
         *  电影院售100张票，三个窗口同时进行，
         *  设计一个程序吗，模拟买票
         *
         *  1.思路：定义一个类Ticket实现窗口，里面定义一个成员变量：private int ticketCount = 100;
         *  2.在Ticket类中重写run方法，实现买票
         *   A:判断票数大于0->买票，并告知那个窗口买的
         *   B:票数减1
         *   c:卖光之后线程停止
         *  3。定义一个TicketDemo，
         *   A:创建ticket对象
         *   B:创建三个Thread对象，把ticket 作为构造方法的参数，并给出对应窗口的名称
         *
         * 多个线程同时操作一个共享数据造成数据重复||负数票
         * 解决方法，让线程依次执行，把能够共享数据的代码锁死
         * 任意时刻只有一个线程可以执行即可
         *
         */
        Ticket t1 = new Ticket();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t1);
        Thread th3 = new Thread(t1);

        th1.setName("窗口一");//
        th2.setName("窗口二");
        th3.setName("窗口三");

        th1.start();
        th2.start();
        th3.start();

    }
}
