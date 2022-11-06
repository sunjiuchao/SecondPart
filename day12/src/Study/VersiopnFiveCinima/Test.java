package Study.VersiopnFiveCinima;

public class Test {
    public static void main(String[] args) {
        MyRunable mr = new MyRunable();
        Thread th1 = new Thread(mr);
        Thread th2 = new Thread(mr);
        th1.setName("窗口一");
        th2.setName("窗口二");
        th1.start();
        th2.start();

    }
}
