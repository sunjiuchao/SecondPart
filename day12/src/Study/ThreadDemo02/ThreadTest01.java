package Study.ThreadDemo02;

public class ThreadTest01 {
    public static void main(String[] args) throws InterruptedException {
//       public static Thread currentThread() 返回当前正在执行的线程对象的引用
//        String name = Thread.currentThread().getName();
//        System.out.println(name);

//        public static void sleep(long time)线程休眠指定时间，单位是毫秒。
        System.out.println("start");
        Thread.sleep(3000);//3秒
        System.out.println("end");
    }
}
