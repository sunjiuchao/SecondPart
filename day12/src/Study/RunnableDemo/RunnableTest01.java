package Study.RunnableDemo;

public class RunnableTest01 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable("一线");//创建了一个参数对象
        Thread th = new Thread(mr);//创建一个Thread（线程）对象，把参数mr传递给线程
        MyRunnable mr2 = new MyRunnable("二线");
        Thread th2 = new Thread(mr2);
        th.start();
        th2.start();
    }
}
