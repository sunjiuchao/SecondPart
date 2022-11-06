package org.Preview;

public class Factory {
    public static void main(String[] args) {
        int number = factorial(5);
        System.out.println(number);
    }
    public static int factorial(int a){
        if (a == 1) {
            return 1;//递归调用的出口
        } else {
            return a * factorial(a-1);
        }

    }
}
