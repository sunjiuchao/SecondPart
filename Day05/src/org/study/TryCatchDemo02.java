package org.study;

public class TryCatchDemo02 {
    public static void main(String[] args) {
        try {
            int arr[] = {1,2,3,4};
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("1111");

    }
}
