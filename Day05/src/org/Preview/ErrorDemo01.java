package org.Preview;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ErrorDemo01 {
    public static void main(String[] args) {

    }

    public static void method() throws NullPointerException {
        int arr[] = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void method1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年mm月dd日");
        sdf.parse("2022年10月20日");
    }
}
