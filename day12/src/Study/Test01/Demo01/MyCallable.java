package Study.Test01.Demo01;

import java.util.concurrent.FutureTask;

public class MyCallable {
    public static void main(String[] args) {
        /**
         *线程的优先级范围：1-10
         * 只是抢夺CPU的机率高，而不是一定高
         */


        CallableDemo01 cd = new CallableDemo01();
        FutureTask<String> ft = new FutureTask<>(cd);
        Thread th = new Thread(ft);
        th.setPriority(10);//设置优先级
//        System.out.println(th.getPriority());//获取默认优先级5
        th.setName("第一");
        th.start();


        CallableDemo01 cd1 = new CallableDemo01();
        FutureTask<String> ft1 = new FutureTask<>(cd1);
        Thread th1 = new Thread(ft1);
        th1.setPriority(1);//设置优先级
//        System.out.println(th1.getPriority());//获取默认优先级5

        th1.setName("第二");
        th1.start();



    }


}
