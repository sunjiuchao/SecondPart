package com.preview.LambBest;

public class Test {
    public static void main(String[] args) {
        Inter inter = new Inter() {
            @Override
            public void dance() {
                System.out.println("dance");
            }

            @Override
            public void rap() {
                System.out.println("rap");
            }

            @Override
            public void sing() {
                System.out.println("sing");
            }
        };
        inter.sing();
        inter.dance();
        inter.rap();

        useKunkunAction useKunkunAction = new useKunkunAction();
        useKunkunAction.sing(()-> System.out.println("唱歌"));
        useKunkunAction.dance(()-> System.out.println("跳舞"));
        useKunkunAction.rap(()-> System.out.println("饶舌"));
    }




}
