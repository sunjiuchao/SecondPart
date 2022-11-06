package com.Demo01;

import java.util.Arrays;

/**
 * 二分查找法
 * 每次去掉一半的查找范围
 */
public class SencondFindDemo04 {
    public static void main(String[] args) {
        int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int number = 2;
        int result = binarySearchForIndex(arr,number);
        System.out.println(result);
        number = 200;
        int result1 = binarySearchForIndex(arr,number);
        System.out.println(result1);
    }
    private static int binarySearchForIndex(int arr[],int number){

        int min = 0;
        int max = arr.length-1;
        while (min <= max){
            int mid = (min+max) >> 1;//计算中间位置
            //mid指向的值大于number
            if (arr[mid]>number){//要查找的元素在左边
                max = mid-1;
            //mid指向的值小于number
            } else if (arr[mid]<number) {//要查找的元素在右边
                min = mid+1;
            //mid指向的值等于number
            }else {
                return mid;
            }
        }
        return -1;
        }
    }

