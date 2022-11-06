package com.Demo01;

public class FunctionDemo06 {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }
    public static int getSum(int i) {
        if (i == 1){
            return 1;
        }else {
            return i +getSum(i-1);
        }

    }
    }

