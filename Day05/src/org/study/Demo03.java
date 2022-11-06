package org.study;

public class Demo03 {
    public static void main(String[] args) {
//        String--->int
        String i1 = "100";
        int i = Integer.parseInt(i1);
        System.out.println(i+1);
//        int ---->String
        int i2 = 100;
        String s = String.valueOf(i2);
        System.out.println(s+2);
    }
}
