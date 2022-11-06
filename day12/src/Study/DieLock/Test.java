package Study.DieLock;

/**
 * 死锁，进A锁关A锁，下一个用A锁被锁死
 * 程序就会一直死等
 */
public class Test {
    public static void main(String[] args) {
        Object ObjA = new Object();
        Object ObjB = new Object();

        new Thread(()->{
            while (true){
                synchronized (ObjA) {
                    synchronized (ObjB){
                        System.out.println("吃西瓜");
                    }
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                synchronized (ObjB) {
                    synchronized (ObjA){
                        System.out.println("吃苹果");
                    }
                }
            }
        }).start();
    }
}
