package com.preview.Date;

import java.util.Date;

public class SetTimeDemo02 {
    public static void main(String[] args) {
        method();
        Date date = new Date();
        date.setTime(0L);
        System.out.println(date);
    }

    private static void method() {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);
        long time2 = System.currentTimeMillis();
        System.out.println(time2);
    }
}
