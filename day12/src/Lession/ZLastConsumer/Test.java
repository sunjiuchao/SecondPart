package Lession.ZLastConsumer;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        Foodie fd = new Foodie();
        Cook ck = new Cook();
        Thread th1 = new Thread(fd);
        Thread th2 = new Thread(ck);

        th1.start();
        th2.start();
    }
}
