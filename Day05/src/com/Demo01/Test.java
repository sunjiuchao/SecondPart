package com.Demo01;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("键盘输入自己的年龄和身高(要带小数)," +
                           "年龄和身高中间使用逗号分隔,：");
        String na = sc.next();
        String[] split = na.split(",");
        int age = Integer.parseInt(split[0]);
        Double high = Double.valueOf(split[1]);
        System.out.println("转成整数后的年龄是"+age);
        System.out.println("转成小数后的身高是"+high);
    }
}
