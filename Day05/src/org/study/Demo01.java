package org.study;

import com.sun.jdi.IntegerValue;

public class Demo01 {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue+" "+minValue);
        Integer i1 = new Integer(121);
        System.out.println(i1);
        Integer i2 = new Integer("123");
        System.out.println(i2);
        Integer i3 = Integer.valueOf(124);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("125");
        System.out.println(i4);
    }
}
