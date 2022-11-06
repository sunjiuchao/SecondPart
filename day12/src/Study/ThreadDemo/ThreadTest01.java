package Study.ThreadDemo;

public class ThreadTest01 {
    public static void main(String[] args) {
        new ThreadDemo01("第一线程").start();//lambda表达式
//                ThreadDemo01 t1 = new ThreadDemo01();
//                ThreadDemo01 t2 = new ThreadDemo01();
//                t1.start();
//                t2.start();
//        run方法封装线程执行的代码，直接调用相当于普通方法的调用，并没有开启线程
//        stsrt方法可以开启线程，让JVM调用此线程的run方法

    }
}
