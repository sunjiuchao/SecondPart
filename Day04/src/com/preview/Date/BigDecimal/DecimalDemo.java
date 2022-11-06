package com.preview.Date.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalDemo {
    public static void main(String[] args) {
        double a = 1;
        double b = 20.2;
        double c = 300.83;
        double d = 1.0/3.0;
        System.out.println((a + b + c));
        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal1 = new BigDecimal(20.2);
        BigDecimal bigDecimal2 = new BigDecimal(300.83);
        BigDecimal sum = bigDecimal.add(bigDecimal1).add(bigDecimal2);
        System.out.println(sum);

        BigDecimal bigDecimal3 = new BigDecimal("1");
        BigDecimal bigDecimal4 = new BigDecimal("3.0");
        BigDecimal bigDecimal5 = new BigDecimal("300.8333333");
//        做加法
        BigDecimal sum1 = bigDecimal3.add(bigDecimal4).add(bigDecimal5).setScale(3,RoundingMode.DOWN);
        BigDecimal sum2 = bigDecimal3.add(bigDecimal4).add(bigDecimal5).setScale(3, RoundingMode.UP);
        BigDecimal sum3 = bigDecimal3.add(bigDecimal4).add(bigDecimal5).setScale(3,RoundingMode.CEILING);
        BigDecimal sum4 = bigDecimal3.add(bigDecimal4).add(bigDecimal5).setScale(3,RoundingMode.DOWN);
        BigDecimal sum5 = bigDecimal3.add(bigDecimal4).add(bigDecimal5).setScale(3,RoundingMode.FLOOR);
//        做减法
        BigDecimal sub = bigDecimal3.subtract(bigDecimal2).subtract(bigDecimal).setScale(3, RoundingMode.DOWN);
//        做乘法
        BigDecimal mul = bigDecimal.multiply(bigDecimal1).multiply(bigDecimal3).setScale(3, RoundingMode.DOWN);
////        做除法
//        BigDecimal divide = bigDecimal3.divide(bigDecimal5.setScale(2, RoundingMode.DOWN)).divide(bigDecimal4.setScale(2 ,RoundingMode.DOWN));
        System.out.println("bigDecimal 的 String类型"+sum1);
        System.out.println("加法"+sum2);
        System.out.println("减法"+sub);
        System.out.println("乘法"+mul);
//        System.out.println("除法"+divide);


    }
}
