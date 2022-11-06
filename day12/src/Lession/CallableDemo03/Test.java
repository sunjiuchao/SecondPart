package Lession.CallableDemo03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * - 定义一个类MyCallable实现Callable接口
 * - 在MyCallable类中重写call()方法
 * - 创建MyCallable类的对象
 * - 创建Future的实现类FutureTask对象，把MyCallable对象作为构造方法的参数
 * - 创建Thread类的对象，把FutureTask对象作为构造方法的参数
 * - 启动线程
 * - 再调用get方法，就可以获取线程结束之后的结果。
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<String> sft = new FutureTask<String>(mc);
        //获取call方法的返回值,返回值为Callable接口的,所以要用sft调用
        Thread th = new Thread(sft);
        th.setName("第一线程");
        String name = th.getName();
        th.start();
        System.out.println(name);
        System.out.println(sft.get());//返回值
    }
}
