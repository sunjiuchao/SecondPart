package Study.ConsumerTest;
/**
 * - 桌子类(Desk)：定义表示包子数量的变量,定义锁对象变量,定义标记桌子上有无包子的变量
 *
 * - 生产者类(Cooker)：实现Runnable接口，重写run()方法，设置线程任务
 * 1.判断是否有包子,决定当前线程是否执行
 * 2.如果有包子,就进入等待状态,如果没有包子,继续执行,生产包子
 * 3.生产包子之后,更新桌子上包子状态,唤醒消费者消费包子
 *
 * - 消费者类(Foodie)：实现Runnable接口，重写run()方法，设置线程任务
 * 1.判断是否有包子,决定当前线程是否执行
 * 2.如果没有包子,就进入等待状态,如果有包子,就消费包子
 * 3.消费包子后,更新桌子上包子状态,唤醒生产者生产包子
 *
 * - 测试类(Demo)：里面有main方法，main方法中的代码步骤如下
 * 创建生产者线程和消费者线程对象
 * 分别开启两个线程
 */
public class Test {
    public static void main(String[] args) {

    }
}