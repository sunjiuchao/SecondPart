package org.study;

public class TryCatch {
    public static void main(String[] args) {
        int arr[] = null;
        try {
            printArr(arr);
        }catch (NullPointerException e){
            System.out.println("参数不能为空，空指针异常");
        }catch (Exception e) {
            System.out.println("333");
        }
    }
    public static void printArr(int arr[]){
        System.out.println("111");
        if (arr == null){
            throw new NullPointerException();
        }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("222");
    } 
}
