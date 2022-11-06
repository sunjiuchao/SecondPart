package Lession.CinimaTicketDemo09;

/**
 * 电影院买票
 */
public class Test {
    public static void main(String[] args) {
        MyTicket ticket = new MyTicket();

        Thread th1 = new Thread(ticket);
        Thread th2 = new Thread(ticket);
        Thread th3 = new Thread(ticket);

        th1.setName("窗口一");
        th2.setName("窗口二");
        th3.setName("窗口三");

        th1.start();
        th2.start();
        th3.start();
    }
}
