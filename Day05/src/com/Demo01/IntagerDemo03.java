package com.Demo01;

public class IntagerDemo03 {
//    把字符串中的数据存入到int类型的数组中
public static void main(String[] args) {
    String s = "91 32 85 93 54 56";
    String[] s1 = s.split(" ");//分割进入数组
    int []arr = new  int[s1.length];//创建数组
    for (int i = 0; i < s1.length; i++) {
        arr[i] = Integer.parseInt(s1[i]);
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
}
