package Lession.ZLastConsumer;

public class Desk {
    //桌子上是否有汉堡
    public static boolean flag = false;
    public static int count = 10;

    //创建唯一的锁对象
    static final Object lock = new Object();

}
