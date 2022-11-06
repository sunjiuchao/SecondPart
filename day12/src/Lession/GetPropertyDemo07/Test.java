package Lession.GetPropertyDemo07;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyRannable mr = new MyRannable();

        Thread th1 = new Thread(mr);
        th1.setName("First");
        th1.setPriority(10);//范围(1-10)
        th1.start();

        //通过setPriority(范围(1-10));方法设置优先级，只是抢占CPU的优先级高，不一定稳定持续优先。（因为抢占cpu随机）

        Thread th2 = new Thread(mr);
        th2.setName("Second");
        th1.setPriority(10);//范围(1-10)
        th2.start();
    }
}
