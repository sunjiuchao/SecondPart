package com.preview.Date.ApiDemo;

public class SystemDemo {
    public static void main(String[] args) {
//    exit终止虚拟机运行[0=>终止，]
//        System.out.println("12");
//        System.exit(0);
//        System.out.println("qweas");
//    gc垃圾回收机制（garbage collection）
//    通知垃圾回收器，进行回收，工作中不能用
//        System.gc();

//        时间戳返回毫秒值
        long l = System.currentTimeMillis();
        System.out.println("nowTime:"+l);

//        最原始的代码优化手段之一
        long start = System.currentTimeMillis();
        String a = "1";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
//            a += i ;
            stringBuilder.append(i);
        }
        long end = System.currentTimeMillis();
//String 不可变 保存数据的Byte[]数组被final修饰，即为常量，
//        System.out.println(stringBuilder);
        System.out.println("time:"+(end - start));

//    arraycopy第一:参数原数组，第二:原数组的地址值，
//             第三:目标数组，第四:目标数组的起始地址，
//             第五:拷贝长度
        int []arr1 = {1,2,3,4,5};
        int []arr2 = new int[10];
        System.arraycopy(arr1,3,arr2,8,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        for (int i : arr2) {
            System.out.print(i);
        }



    }
}
