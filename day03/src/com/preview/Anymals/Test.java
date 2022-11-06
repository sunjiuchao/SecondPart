package com.preview.Anymals;

public class Test {
    public static void main(String[] args) {
        Kunkunaction kunkunaction = new Kunkunaction() {
            @Override
            public void sing() {
                System.out.println("唱歌");
            }

            @Override
            public void rap() {
                System.out.println("说唱");
            }

            @Override
            public void dance() {
                System.out.println("跳舞");
            }
        };



        Lishi lishi = new Lishi();
        lishi.work();
        lishi.ikunAction(kunkunaction);
    }
}
