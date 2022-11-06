package com.preview.Demo03;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
//        {2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6}
//        请使用代码找出上面数组中的所有的数据,要求重复的数据只能保留一份
        double arr[] = {2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6};
        TreeSet<Double> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
            System.out.println(set);
    }
}
