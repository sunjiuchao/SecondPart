package UnitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDemo01 {
    @After
    public  void show1(){
        System.out.println("1");
    }
    @Before
    public  void show2() {
        System.out.println("2");
    }
    @Test
    public  void show3(){
        System.out.println("3");
    }
}
