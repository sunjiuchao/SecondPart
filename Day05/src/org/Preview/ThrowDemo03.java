package org.Preview;

public class ThrowDemo03 {
    public static void main(String[] args) {
        int arr[] = null;
        try {
//            有可能出现异常的代码
            printarr(arr);
        }catch (NullPointerException e){
//            抛出的内容
            System.out.println(e);
            System.out.println("出现异常，参数不能为NULL");
        }
//        手动抛出异常之后继续执行一场下面的操作
        System.out.println("1111");
    }
    public static void printarr(int arr[]){
        if (arr == null){
            throw new NullPointerException();
        }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
