package org.Preview;

public class RuntimeExceptionDemo {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("异常之前");
        System.out.println(arr[10]);
//        当代码出现异常时，虚拟机会创建一个异常对象
//        new ArrayIndexOutOfBoundsException();
//        首先会看有没有自己处理异常的代码
//        最终这个异常会交给虚拟机处理
//        JVM处理异常会做什么：
//        1，异常信息标记展示
//        2.停止运行程序，在哪出错在哪停止
        System.out.println("异常之后");
    }
}
