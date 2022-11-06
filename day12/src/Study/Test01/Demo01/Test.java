package Study.Test01.Demo01;

public class Test {
    public static void main(String[] args) {
        /**
         * 现成的两种调度模型
         * 1、分时调度模型：所有线程轮流使用CPU的使用权，平均分配线程占用CPU的时间片
         * 2、抢占式调度模型：让优先级高的线程使用CPU,如果线程的优先级相同，会随机选择一个，
         * 优先级高的线程获取的CPU时间片相对多一点
         *
         * 线程的优先级可以获取也可以设置
         * public final void setPriority(int newPriority )  设置
         * public final int getPriority()                   获取
         */
    }
}
