package Lession.EG;

public class Demo {
    /*
    满足什么条件才有可能会产生线程不安全的情况?
    1,得是多线程的环境
    2,得是多条线程操作共享数据
     */
    public static void main(String[] args) {
        Foodie foodie = new Foodie();
        Cook cook = new Cook();

        foodie.start();
        cook.start();
    }
}
