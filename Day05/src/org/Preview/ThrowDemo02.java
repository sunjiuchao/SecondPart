package org.Preview;

public class ThrowDemo02 {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
        int arr[] = null;
        printArr(arr);
    }
    public static void printArr(int arr[]){
        if (arr == null){
            throw new NullPointerException();
        }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

    }
}
