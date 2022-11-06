package com.preview;

import java.util.Random;
import java.util.TreeSet;

public class Demo04 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0;; i++) {
            if (set.size() < 8){
                Random r = new Random();
                int num = r.nextInt(10)+11;
                System.out.println("第"+i+"次生成的随机数是："+num);
                set.add(num);
            }else {
                break;
            }

        }
        System.out.println("集合中8个不重复的是"+set);
    }
}
