package com.Demo01;

import java.util.Arrays;
import java.util.Collections;

public class BlueArrayDemo05 {
    public static void main(String[] args) {
        Integer arr[] = {1,8,6,4,7,3};
        printArr(arr);
    }
    public static void printArr(Integer[] arr){
//        for (int j = 0; j < arr.length-1; j++) {//外层循环控制的是次数
//            for (int i = 0; i < arr.length-1-j; i++) {//内层循环控制的次数每次减1
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];//换位置
//                    arr[i+1]=temp;
//                }
//            }
//        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
