package com.preview.Anymals;

import com.preview.LambBest.Dance;

public class LambdaTest {
    public static void main(String[] args) {
        //匿名内部类方法
        useAction(new Dance(){
            @Override
            public void dance() {
                System.out.println("匿名内部类跳舞方法");
            }
        });


        //Lambda方法
        useAction(()->
            System.out.println("Lambda跳舞方法")
        );


    }
    public static void useAction(Dance dance){
        dance.dance();
    }
}
