package com.preview.Date.ApiDemo;

public class MathDemo {
    public static void main(String[] args) {
//        1.abs绝对值
        int abs = Math.abs(-1);
        System.out.println(abs);
//        2.round四舍五入
        long round = Math.round(1.23);
        System.out.println(round);
//        ceil 向上进一
        double ceil = Math.ceil(12.55);
        System.out.println(ceil);
//        floor 向下取整
        double floor = Math.floor(12.55);
        System.out.println(floor);
//        max min 最大最小值
        int max = Math.max(1, 2);
        int min = Math.min(1, 2);
        System.out.println(max);
        System.out.println(min);
//        pow  power幂运算
        double pow = Math.pow(2, 3);
        System.out.println(pow);

//        平方根
        double sqrt = Math.sqrt(16);
        System.out.println(sqrt);

//        random 随机值 random()=>0:1 之间的随机数

        double random = Math.random();
        System.out.println(random);


    }

    


    /**
     * 二进制转换为十六进制
     * @param a 代表传入的二进制
     */
    public void brf(int a){

    }
}
