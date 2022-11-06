package com.preview.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo03 {
    public static void main(String[] args) throws ParseException {
        /*
        当前年月日分时秒
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日 HH:mm:ss");
        String re = sdf.format(date);
        System.out.println(re);
        */

        Date date = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat();
        String format = sdf1.format(date);
        System.out.println(format);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String re = sdf.format(date);
        System.out.println(re);

        System.out.println("===============================");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = "2022-12-02 23:04:43";
        Date parse = sdf2.parse(s);
        System.out.println(parse);
    }
}
