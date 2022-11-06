package com.preview.Demo01;

import java.util.Random;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
//        蓝球
        Random random = new Random();
        int blue = random.nextInt(16)+ 1;

//        红球
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> redBall = new TreeSet<>();
        for (int i = 0; i < 33; i++) {
            set.add(i);
        }
        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            int num = r.nextInt(set.size());
            redBall.add(num);
        }
        System.out.println("红球"+redBall+" | 蓝球"+blue);
    }
}
