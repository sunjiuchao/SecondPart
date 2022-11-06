package com.preview.Lambda;

public class EatableTest {
    public static void main(String[] args) {
        //法一：外部接口重写
        EatableTest.useEatable(new EatbleDemo());

        //法二：内部类重写
        useEatable(new Eatable() {
            @Override
            public int eat(int a,int b) {
                System.out.println("内部类重写"+(a+b));
                return a+b;
            }
        });

        //法三：抽象类匿名重写
        Abstract A = new Abstract() {
            @Override
            public void eat1(int a, int b) {
                System.out.println(a * b);
            }
        };
        A.eat1(40,60);

        //法四：Lambda表达式
        useEatable((a,b)->{
            System.out.println("lambda表达式");
            return a*b;
        });
    }
    public static void useEatable(Eatable eatable){
        int num = eatable.eat(2,5);
        System.out.println(num);
    }
}
