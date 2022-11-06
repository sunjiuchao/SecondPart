package Lession.DieLockDemo13;

public class Test {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        new Thread(()->{
            synchronized (obj1){
                synchronized (obj2){
                    System.out.println("张吃饭");
                }
            }
        }).start();
        new Thread(()->{
            synchronized (obj2){
                synchronized (obj1){
                    System.out.println("张吃饭");
                }
            }
        }).start();
    }
}
