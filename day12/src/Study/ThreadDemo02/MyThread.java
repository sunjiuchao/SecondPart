package Study.ThreadDemo02;

public class MyThread extends Thread{
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    /**
     * private Thread(ThreadGroup g, Runnable target, String name,
     *                    long stackSize, AccessControlContext acc,
     *                    boolean inheritThreadLocals) {
     *         if (name == null) {
     *             throw new NullPointerException("name cannot be null");
     *         }
     *
     *         this.name = name;
     *
     *
     *         private static synchronized int nextThreadNum() {
     *         return threadInitNumber++;
     *     }
     */


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"@@@"+i);
        }

    }
}
