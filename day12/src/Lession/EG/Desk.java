package Lession.EG;

public class Desk {
    //定义一个标记, flag 默认值为false
    //true: 代表桌子上有汉堡
    //false: 代表桌子上没有汉堡
    public static boolean flag = false;

    //汉堡包的总数量
    public static int count = 10;

    //创建唯一的锁对象
     static final Object lock = new Object();
}
