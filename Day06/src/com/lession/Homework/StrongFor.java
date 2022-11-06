package com.lession.Homework;

import java.util.ArrayList;
import java.util.Collection;

public class StrongFor {
    public static void main(String[] args) {
    //请定义一个Collection类型的集合，存储以下分数信息：
    //88.5,39.2,77.1,56.8,89.0,99.0,59.5
        Collection<Double> list = new ArrayList<>();
        list.add(88.5);
        list.add(39.2);
        list.add(77.1);
        list.add(56.8);
        list.add(89.0);
        list.add(99.0);
        list.add(59.5);

    // 使用增强for遍历所有元素，并打印
        for (Double s : list) {
            System.out.println(s);
        }


        System.out.println("======不及格的分数如下：=======");
    //使用增强for遍历所有元素，打印不及格的分数；
        for (Double d : list) {
            if (d < 60){
                System.out.println(d);
            }
        }
        System.out.println("================================");
    //使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        int count = 0;
        double sum = 0;

        double max = 0;
        for (Double d : list) {
            if (d >max){
                max = d;
            }
            if (d < 60){
                sum += d;
                count++;
            }
        }
        double avg = sum/count;
        System.out.println("不及格的人数有："+count+"人");
        System.out.println("不及格的人平均分是："+avg);
        System.out.println("最大值："+max);
    //使用增强for遍历所有元素，求出最高分，并打印


    }
}
