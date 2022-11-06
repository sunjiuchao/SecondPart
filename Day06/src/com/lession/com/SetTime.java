package com.lession.com;

import java.util.Date;

public class SetTime {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

        date.setTime(0L);
        long time1 = date.getTime();
        System.out.println(time1);
    }
}
