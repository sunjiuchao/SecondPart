package com.preview.Lambda;

public class EatbleDemo implements Eatable{

    @Override
    public int eat(int a, int b) {
        System.out.println("外部接口重写"+(a+b));
        return a*b;
    }
}
