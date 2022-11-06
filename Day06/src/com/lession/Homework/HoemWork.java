package com.lession.Homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HoemWork {
    public static void main(String[] args) throws ParseException {
    String dateStr = "2022/2/22";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(dateStr);
        System.out.println(parse);
    }
}
