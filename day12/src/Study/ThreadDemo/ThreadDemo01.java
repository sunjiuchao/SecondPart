package Study.ThreadDemo;

public class ThreadDemo01 extends Thread{
    public ThreadDemo01() {
        super();
    }

    public ThreadDemo01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+i);
        }
    }
}
