package org.Preview;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ErrorExciption {
    public static void main(String[] args) throws ParseException {
//        ArrayIndexOutOfBoundsException
//        索引超出异常
//        int arr[] = {1,2,3,4,5,6};
//        System.out.println(arr[6]);

//        空指针异常
//        NullPointerException
        String s = null;
        System.out.println(s.equals(null));

//        ParseException格式异常
//        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月DD日");
//        sdf.parse("2022-1月1日");
    }
}
