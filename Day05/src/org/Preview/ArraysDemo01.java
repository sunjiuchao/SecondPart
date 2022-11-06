package org.Preview;

import java.util.Arrays;

public class ArraysDemo01 {
    public static void main(String[] args) {
        int arr[] = {3,5,8,2,4,1};
        System.out.println(Arrays.toString(arr));//以字符串的形式来输出数组内容

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int arr1[] = {1,2,3,4,5,6,7};
        int index = Arrays.binarySearch(arr1,4);
        System.out.println(index);
    }

}
