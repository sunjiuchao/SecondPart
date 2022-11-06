package Lession.ThreadDemo01;
/**
 *  - 定义一个类MyThread继承Thread类
 *  - 在MyThread类中重写run()方法
 *  - 创建MyThread类的对象
 *  - 启动线程
 *
 * 线程执行的特点：每次执行都不一样，优先抢占CPU的优先有执行权
 *
 * start方法才是开启线程，由JVM调用run方法
 * 直接调用run方法就是调用普通方法，顺序执行。
 * */
public class Test {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.setName("第一线程");
        MyThread mt2 = new MyThread();
        mt2 .setName("第二线程");

        mt1.start();
        mt2.start();
    }
}
