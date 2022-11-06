package com.preview.Date;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
//        Date空参创建对象代表是当前电脑的时间
        Date date = new Date();
        System.out.println(date);


//        Date有参创建对象代表是计算机开始时间 1970年01月01日 08：00：00
        Date date1 = new Date(3600L * 1000 * 4);
        System.out.println(date1);

    }

}
