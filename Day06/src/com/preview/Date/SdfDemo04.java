package com.preview.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SdfDemo04 {
    public static void main(String[] args) throws ParseException {
        //格式化一致
        String s = "2027-12-02";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日 HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}
