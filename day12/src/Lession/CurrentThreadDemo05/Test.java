package Lession.CurrentThreadDemo05;

/**
 * - 定义一个类MyRunnable实现Runnable接口
 * - 在MyRunnable类中重写run()方法
 * - 创建MyRunnable类的对象
 * - 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
 * - 启动线程
 */
public class Test {
    public static void main(String[] args) {
//        创建MyRunnable对象，因为MyRunnable和Thread没有直接的实现关系，
//        所以不能使用start方法，需要创建Thread对象，把MyRunnable对象参数传入Thread中
        MyRunnable mr = new MyRunnable();
//        调用的是Thread线程的有参构造方法，需要一个Rannable接口
//        所以需要创建一个Rannable接口的实现类对象mr
        Thread th = new Thread(mr);
        th.setName("第一线程");
        th.start();
        Thread th1 = new Thread(mr);
        th1.setName("第二线程");
        th1.start();

    }
}
