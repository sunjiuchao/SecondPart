package org.HomeWork;

public class Test03 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        try {
            int a = arr[3];
            System.out.println(a);
        } catch (NullPointerException e) {
            System.out.println("数组角标越界了");
            e.printStackTrace();
        }
        System.out.println("程序执行完毕了");
    }
}
