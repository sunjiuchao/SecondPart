package Study.ThreadDemo02;

public class TestThread {
    public static void main(String[] args) {
        /**
         * getName  获取线程的名字
         * JVM调用线程时在Thread方法里面会自动给线程取名为0
         * 启动另外线程时自增1
         *
         * 也可以给线程手动设置名字（两种方法 1.setname  2.构造方法 ）
         */
        Thread t1 = new MyThread("首页线程");
        Thread t2 = new MyThread("我的线程");
//        t1.setName("首页线程");
//        t2.setName("我的线程");
        t1.start();
        t2.start();

    }
}
