package com.preview.Collection.zuoye;

import java.math.BigDecimal;

public class Student {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("0.01");
        BigDecimal bigDecimal1 = new BigDecimal("0.05");
        BigDecimal divide = bigDecimal.divide(bigDecimal1);
        System.out.println(divide);

    }
}
