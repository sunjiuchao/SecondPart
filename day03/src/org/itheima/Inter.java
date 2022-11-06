package org.itheima;

public class Inter {
//    内部类
    int num = 20;
    public class In{
        private void show(){
            System.out.println("内部类");
            System.out.println(num);

        }
    }
    public void method(){
        In in = new In();
        in.show();
    }
//    局部内部类
    public void method2(){
        int num = 10;
        class inter1{
            public void show2(){
                System.out.println("局部内部类");
                System.out.println(Inter.this.num);
                System.out.println(num);
            }
        }
        inter1 inter1 = new inter1();
        inter1.show2();
    }
}
