package Lession;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        // 要执行的测试代码
        System.out.println("test");
    }

    @Before
    public void before() {
        // 在执行测试代码之前执行，一般用于初始化操作
        System.out.println("before");
    }

    @After
    public void after() {
        // 在执行测试代码之后执行，一般用于释放资源
        System.out.println("after");
    }

}
